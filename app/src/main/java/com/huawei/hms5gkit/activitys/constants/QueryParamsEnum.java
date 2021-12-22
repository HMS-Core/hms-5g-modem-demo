/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei.hms5gkit.activitys.constants;

import com.huawei.hms5gkit.agentservice.constants.ModemType;
import com.huawei.hms5gkit.agentservice.constants.parameters.Bearer;
import com.huawei.hms5gkit.agentservice.constants.parameters.Lte;
import com.huawei.hms5gkit.agentservice.constants.parameters.ModemSlice;
import com.huawei.hms5gkit.agentservice.constants.parameters.NetDiagnosis;
import com.huawei.hms5gkit.agentservice.constants.parameters.Nr;
import com.huawei.hms5gkit.R;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum QueryParamsEnum {
    LTE_TYPE(R.id.lte_cb, Lte.LTE),
    LTE_TYPE_ARFCN(R.id.lte_arfcn_cb, Lte.LTE_ARFCN),
    LTE_TYPE_PHYCELLID(R.id.lte_phyCellId_cb, Lte.LTE_PHYCELLID),
    LTE_TYPE_DLFREQ(R.id.lte_dlFreq_cb, Lte.LTE_DLFREQ),
    LTE_TYPE_BAND(R.id.lte_band, Lte.LTE_BAND),
    LTE_TYPE_MIMO(R.id.lte_mimo, Lte.LTE_MIMO),
    LTE_TYPE_DLBANDWIDTH(R.id.lte_dbw, Lte.LTE_DL_BANDWIDTH),
    LTE_TYPE_LTEMODETYPE(R.id.lte_lmt, Lte.LTE_LTE_MODE_TYPE),
    LTE_TYPE_TRACKAREACODE(R.id.lte_tac, Lte.LTE_TRACK_AREA_CODE),
    LTE_TYPE_CELLIDENTITY(R.id.lte_cid, Lte.LTE_CELL_IDENTITY),
    LTE_TYPE_MCC(R.id.lte_mcc, Lte.LTE_MCC),
    LTE_TYPE_MNC(R.id.lte_mnc, Lte.LTE_MNC),
    LTE_TYPE_MEASCELL(R.id.lte_mcell, Lte.LTE_INTRA_EUTRA_CELL_MEAS_INFO),
    LTE_TYPE_MEASCELL_CELLID(R.id.lte_m_cid, Lte.LTE_INTRA_EUTRA_CELL_MEAS_INFO_CELLID),
    LTE_TYPE_MEASCELL_RSRP(R.id.lte_m_rsrp, Lte.LTE_INTRA_EUTRA_CELL_MEAS_INFO_RSRP),
    LTE_TYPE_MEASCELL_RSRQ(R.id.lte_m_rsrq, Lte.LTE_INTRA_EUTRA_CELL_MEAS_INFO_RSRQ),
    LTE_TYPE_MEASCELL_SINR(R.id.lte_m_sinr, Lte.LTE_INTRA_EUTRA_CELL_MEAS_INFO_SINR),
    LTE_TYPE_SCELL(R.id.lte_scell, Lte.LTE_SCELL),
    LTE_TYPE_SCELL_ARFCN(R.id.lte_s_arfcn, Lte.LTE_SCELL_arfcn),
    LTE_TYPE_SCELL_PHYCELLID(R.id.lte_s_pid, Lte.LTE_SCELL_phyCellId),
    LTE_TYPE_SCELL_DLFREQ(R.id.lte_s_df, Lte.LTE_SCELL_dlFreq),
    LTE_TYPE_SCELL_BAND(R.id.lte_s_band, Lte.LTE_SCELL_band),
    LTE_TYPE_SCELL_MIMO(R.id.lte_s_mimo, Lte.LTE_SCELL_mimo),
    LTE_TYPE_SCELL_DLBANDWIDTH(R.id.lte_s_dbw, Lte.LTE_SCELL_dlBandWidth),
    LTE_TYPE_SCELL_RSRP(R.id.lte_s_rsrp, Lte.LTE_SCELL_rsrp),
    LTE_TYPE_SCELL_RSRQ(R.id.lte_s_rsrq, Lte.LTE_SCELL_rsrq),
    LTE_TYPE_SCELL_SINR(R.id.lte_s_sinr, Lte.LTE_SCELL_sinr),

    NR_TYPE(R.id.nr, Nr.NR),
    NR_TYPE_SERVPRIMARYCELLINFO(R.id.n_spcinfo, Nr.NR_SPCELL_INFO),
    NR_TYPE_SERVCELLINFO(R.id.n_scinfo, Nr.NR_SCELL_INFO),
    NR_TYPE_SERVPRIMARYCELLINFO_BASIC(R.id.n_sp_basic, Nr.NR_SPCELL_BASIC),
    NR_TYPE_SERVPRIMARYCELLINFO_CFG(R.id.n_sp_cfg, Nr.NR_SPCELL_CFG),
    NR_TYPE_SERVPRIMARYCELLINFO_MEAS(R.id.n_sp_meas, Nr.NR_SPCELL_MEAS),
    NR_TYPE_SERVCELLINFO_BASIC(R.id.n_sc_basic, Nr.NR_SCELL_BASIC),
    NR_TYPE_SERVCELLINFO_CFG(R.id.n_sc_cfg, Nr.NR_SCELL_CFG),
    NR_TYPE_SERVCELLINFO_SSB_MEAS(R.id.n_sc_ssbmeasinfo, Nr.NR_SCELL_SSB_MEAS),


    BEARER_TYPE(R.id.bearer_cb, Bearer.BEARER),
    BEARER_TYPE_DRBINFO(R.id.bearer_dinfo, Bearer.BEARER_DRB_INFO),
    BEARER_TYPE_DRBINFO_RBID(R.id.bearer_d_rbid, Bearer.BEARER_RBID),
    BEARER_TYPE_DRBINFO_PDCPVERSION(R.id.bearer_d_pver, Bearer.BEARER_PDCP_VERSION),
    BEARER_TYPE_DRBINFO_BEARERTYPE(R.id.bearer_d_btype, Bearer.BEARER_BEARER_TYPE),
    BEARER_TYPE_DRBINFO_DATASPLITTHRESHOLD(R.id.bearer_d_dst, Bearer.BEARER_DATA_SPLIT_THRESHOLD),

    NET_TYPE_INFO(R.id.nd, NetDiagnosis.NET),
    NET_TYPE_LTE_INFO(R.id.nd_lteinfo,NetDiagnosis.NET_LTE_INFO),
    NET_TYPE_NR_INFO(R.id.nd_nrinfo,NetDiagnosis.NET_NR_INFO),
    NET_TYPE_LTE_REJ_CNT(R.id.nd_l_rejcnt,NetDiagnosis.NET_LTE_REJ_CNT),
    NET_TYPE_LTE_REJ_INFOS(R.id.nd_l_rejinfos,NetDiagnosis.NET_LTE_REJ_INFOS),
    NET_TYPE_LTE_PDN_REJ_CNT(R.id.nd_l_pdnrejcnt,NetDiagnosis.NET_LTE_PDN_REJ_CNT),
    NET_TYPE_LTE_PDN_REJ_INFOS(R.id.nd_l_pdnrejinfos,NetDiagnosis.NET_LTE_PDN_REJ_INFOS),
    NET_TYPE_LTE_AMBR_CNT(R.id.nd_l_ambrcnt,NetDiagnosis.NET_LTE_AMBR_CNT),
    NET_TYPE_LTE_AMBRS(R.id.nd_l_ambrs,NetDiagnosis.NET_LTE_AMBRS),
    NET_TYPE_NR_REJ_CNT(R.id.nd_n_rejcnt,NetDiagnosis.NET_NR_REJ_CNT),
    NET_TYPE_NR_REJ_INFO(R.id.nd_n_rejinfo,NetDiagnosis.NET_NR_REJ_INFO),
    NET_TYPE_NR_PDU_REJ_CNT(R.id.nd_n_pdurejcnt,NetDiagnosis.NET_NR_PDU_REJ_CNT),
    NET_TYPE_NR_PDU_REJ_INFO(R.id.nd_n_pdurejinfo,NetDiagnosis.NET_NR_PDU_REJ_INFO),
    NET_TYPE_NR_AMBR_CNT(R.id.nd_n_ambrcnt,NetDiagnosis.NET_NR_AMBR_CNT),
    NET_TYPE_NR_AMBR(R.id.nd_n_ambrs,NetDiagnosis.NET_NR_AMBR),

    MODEM_SLICE(R.id.modem_slice, ModemSlice.MODEM_SLICE);


    private int resourceId; // Checkbox resource id
    private String queryName; // Request parameter

    private static Map<Integer, String> resourceId2QueryNameMap
            = Arrays.stream(QueryParamsEnum.values())
            .collect(Collectors.toMap(QueryParamsEnum::getResourceId, QueryParamsEnum::getQueryName));

    QueryParamsEnum(int resourceId, String queryName) {
        this.resourceId = resourceId;
        this.queryName = queryName;
    }

    public static Map<Integer, String> getResourceId2QueryNameMap() {
        return resourceId2QueryNameMap;
    }

    private int getResourceId() {
        return resourceId;
    }

    private String getQueryName() {
        return queryName;
    }
}
