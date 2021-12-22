/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2021. All rights reserved.
 */

package com.huawei.hms5gkit.activitys.impl;

import android.widget.CheckBox;

import com.huawei.hms5gkit.R;
import com.huawei.hms5gkit.activitys.base.BaseActivity;

import butterknife.BindView;

public abstract class HmsKitBaseActivity extends BaseActivity {
    @BindView(R.id.fe_scg)
    CheckBox feScgCbox;
    @BindView(R.id.fe_rach)
    CheckBox feRachCbox;
    @BindView(R.id.fe_rl)
    CheckBox feRadioLinkCbox;
    @BindView(R.id.fe_ho)
    CheckBox feHandOverCbox;

    @BindView(R.id.lte_cb)
    CheckBox lteCbox;
    @BindView(R.id.lte_arfcn_cb)
    CheckBox lteArfcnCbox;
    @BindView(R.id.lte_phyCellId_cb)
    CheckBox ltePhyCellIdCbox;
    @BindView(R.id.lte_dlFreq_cb)
    CheckBox lteDlFreqCbox;
    @BindView(R.id.lte_band)
    CheckBox lteBandCbox;
    @BindView(R.id.lte_mimo)
    CheckBox lteMimoCbox;
    @BindView(R.id.lte_dbw)
    CheckBox lteDlBandWidthCbox;
    @BindView(R.id.lte_lmt)
    CheckBox lteModeTypeCbox;
    @BindView(R.id.lte_tac)
    CheckBox lteTrackAreaCodeCbox;
    @BindView(R.id.lte_cid)
    CheckBox lteCellIdentityCbox;
    @BindView(R.id.lte_mcc)
    CheckBox lteMccCbox;
    @BindView(R.id.lte_mnc)
    CheckBox lteMncCbox;
    @BindView(R.id.lte_mcell)
    CheckBox lteMeasCellCbox;
    @BindView(R.id.lte_m_cid)
    CheckBox lteMeasCellCellIdCbox;
    @BindView(R.id.lte_m_rsrp)
    CheckBox lteMeasCellRsrpCbox;
    @BindView(R.id.lte_m_rsrq)
    CheckBox lteMeasCellRsrqCbox;
    @BindView(R.id.lte_m_sinr)
    CheckBox lteMeasCellSinrCbox;
    @BindView(R.id.lte_scell)
    CheckBox lteScellCbox;
    @BindView(R.id.lte_s_arfcn)
    CheckBox lteScellArfcnCbox;
    @BindView(R.id.lte_s_pid)
    CheckBox lteScellPhyCellIdCbox;
    @BindView(R.id.lte_s_df)
    CheckBox lteScellDlFreqCbox;
    @BindView(R.id.lte_s_band)
    CheckBox lteScellBandCbox;
    @BindView(R.id.lte_s_mimo)
    CheckBox lteScellMimoCbox;
    @BindView(R.id.lte_s_dbw)
    CheckBox lteScellDlBandWidthCbox;
    @BindView(R.id.lte_s_rsrp)
    CheckBox lteScellRsrpCbox;
    @BindView(R.id.lte_s_rsrq)
    CheckBox lteScellRsrqCbox;
    @BindView(R.id.lte_s_sinr)
    CheckBox lteScellSinrCbox;

    @BindView(R.id.nr)
    CheckBox nrCbox;
    @BindView(R.id.n_scinfo)
    CheckBox nrServCellInfoCbox;
    @BindView(R.id.n_sc_basic)
    CheckBox nrServCellInfoBasicCbox;
    @BindView(R.id.n_sc_cfg)
    CheckBox nrServCellInfoCfgInfoCbox;
    @BindView(R.id.n_sc_ssbmeasinfo)
    CheckBox nrServCellInfoSsbMeasCbox;
    @BindView(R.id.n_spcinfo)
    CheckBox nrSPCellInfoCbox;
    @BindView(R.id.n_sp_basic)
    CheckBox nrSPCellInfoBasicCbox;
    @BindView(R.id.n_sp_cfg)
    CheckBox nrSPCellInfoCfgInfoCbox;
    @BindView(R.id.n_sp_meas)
    CheckBox nrSPCellInfoMeasCbox;

    @BindView(R.id.bearer_cb)
    CheckBox bearerCbox;
    @BindView(R.id.bearer_dinfo)
    CheckBox bearerDrbInfoCbox;
    @BindView(R.id.bearer_d_rbid)
    CheckBox bearerDrbInfoRbIdCbox;
    @BindView(R.id.bearer_d_pver)
    CheckBox bearerDrbInfoPdcpVersionCbox;
    @BindView(R.id.bearer_d_btype)
    CheckBox bearerDrbInfoBearerTypeCbox;
    @BindView(R.id.bearer_d_dst)
    CheckBox bearerDrbInfoDataSplitThresholdCbox;

    @BindView(R.id.nd)
    CheckBox ndTypeCbox;
    @BindView(R.id.nd_lteinfo)
    CheckBox ndLteInfoCbox;
    @BindView(R.id.nd_nrinfo)
    CheckBox ndNrInfoCbox;
    @BindView(R.id.nd_l_rejcnt)
    CheckBox ndLteRejCntCbox;
    @BindView(R.id.nd_l_rejinfos)
    CheckBox ndLteRejInfosCbox;
    @BindView(R.id.nd_l_pdnrejcnt)
    CheckBox ndLtePdnRejcntCbox;
    @BindView(R.id.nd_l_pdnrejinfos)
    CheckBox ndLtePdnRejInfosCbox;
    @BindView(R.id.nd_l_ambrcnt)
    CheckBox ndLteAmbrCntCbox;
    @BindView(R.id.nd_l_ambrs)
    CheckBox ndLteAmbrsCbox;
    @BindView(R.id.nd_n_rejcnt)
    CheckBox ndNrRejCntCbox;
    @BindView(R.id.nd_n_rejinfo)
    CheckBox ndNrRejInfosCbox;
    @BindView(R.id.nd_n_pdurejcnt)
    CheckBox ndNrPduRejCntCbox;
    @BindView(R.id.nd_n_pdurejinfo)
    CheckBox ndNrPduRejInfoCbox;
    @BindView(R.id.nd_n_ambrcnt)
    CheckBox ndNrAmbrCntCbox;
    @BindView(R.id.nd_n_ambrs)
    CheckBox ndNrAmbrCbox;

    @BindView(R.id.modem_slice)
    CheckBox modemsliceCbox;
}
