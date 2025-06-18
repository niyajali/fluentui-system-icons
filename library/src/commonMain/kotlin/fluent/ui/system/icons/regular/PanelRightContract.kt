package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PanelRightContract: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelRightContract",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.193f, 9.249f)
            curveTo(9.47f, 8.941f, 9.944f, 8.916f, 10.252f, 9.193f)
            lineTo(12.752f, 11.443f)
            curveTo(12.91f, 11.585f, 13f, 11.787f, 13f, 12f)
            curveTo(13f, 12.213f, 12.91f, 12.415f, 12.752f, 12.557f)
            lineTo(10.252f, 14.807f)
            curveTo(9.944f, 15.084f, 9.47f, 15.059f, 9.193f, 14.751f)
            curveTo(8.915f, 14.443f, 8.94f, 13.969f, 9.248f, 13.692f)
            lineTo(10.295f, 12.75f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 12.75f, 6f, 12.414f, 6f, 12f)
            curveTo(6f, 11.586f, 6.336f, 11.25f, 6.75f, 11.25f)
            horizontalLineTo(10.295f)
            lineTo(9.248f, 10.308f)
            curveTo(8.94f, 10.031f, 8.915f, 9.557f, 9.193f, 9.249f)
            close()
            moveTo(22f, 17.251f)
            curveTo(22f, 18.769f, 20.769f, 20f, 19.25f, 20f)
            lineTo(4.75f, 20f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.251f)
            verticalLineTo(6.749f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineTo(19.25f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.749f)
            lineTo(22f, 17.251f)
            close()
            moveTo(19.25f, 18.5f)
            curveTo(19.94f, 18.5f, 20.5f, 17.941f, 20.5f, 17.251f)
            lineTo(20.5f, 6.749f)
            curveTo(20.5f, 6.059f, 19.94f, 5.5f, 19.25f, 5.5f)
            lineTo(15.996f, 5.5f)
            lineTo(15.996f, 18.5f)
            horizontalLineTo(19.25f)
            close()
            moveTo(14.496f, 18.5f)
            lineTo(14.496f, 5.5f)
            lineTo(4.75f, 5.5f)
            curveTo(4.06f, 5.5f, 3.5f, 6.059f, 3.5f, 6.749f)
            lineTo(3.5f, 17.251f)
            curveTo(3.5f, 17.941f, 4.06f, 18.5f, 4.75f, 18.5f)
            lineTo(14.496f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PanelRightContractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PanelRightContract, contentDescription = null)
    }
}
