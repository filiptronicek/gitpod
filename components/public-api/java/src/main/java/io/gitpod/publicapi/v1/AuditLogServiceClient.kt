// Copyright (c) 2025 Gitpod GmbH. All rights reserved.
// Licensed under the GNU Affero General Public License (AGPL).
// See License.AGPL.txt in the project root for license information.

// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/auditlogs.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.MethodSpec
import com.connectrpc.ProtocolClientInterface
import com.connectrpc.ResponseMessage
import com.connectrpc.StreamType

public class AuditLogServiceClient(
  private val client: ProtocolClientInterface,
) : AuditLogServiceClientInterface {
  /**
   *  ListAuditLogs returns a list of audit logs
   */
  override suspend fun listAuditLogs(request: Auditlogs.ListAuditLogsRequest, headers: Headers):
      ResponseMessage<Auditlogs.ListAuditLogsResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.AuditLogService/ListAuditLogs",
      io.gitpod.publicapi.v1.Auditlogs.ListAuditLogsRequest::class,
      io.gitpod.publicapi.v1.Auditlogs.ListAuditLogsResponse::class,
      StreamType.UNARY,
    ),
  )

}
