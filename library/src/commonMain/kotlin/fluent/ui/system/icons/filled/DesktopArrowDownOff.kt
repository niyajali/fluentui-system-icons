package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.DesktopArrowDownOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopArrowDownOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.941f, 18.002f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(2.629f, 3.689f)
            curveTo(2.239f, 4.094f, 2f, 4.644f, 2f, 5.25f)
            verticalLineTo(15.752f)
            lineTo(2.005f, 15.906f)
            curveTo(2.084f, 17.077f, 3.059f, 18.002f, 4.25f, 18.002f)
            lineTo(8.499f, 18.001f)
            verticalLineTo(20.5f)
            lineTo(6.75f, 20.5f)
            lineTo(6.648f, 20.507f)
            curveTo(6.282f, 20.556f, 6f, 20.87f, 6f, 21.25f)
            curveTo(6f, 21.664f, 6.336f, 22f, 6.75f, 22f)
            horizontalLineTo(17.25f)
            lineTo(17.352f, 21.993f)
            curveTo(17.718f, 21.943f, 18f, 21.63f, 18f, 21.25f)
            curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
            lineTo(15.499f, 20.5f)
            verticalLineTo(18.001f)
            lineTo(16.941f, 18.002f)
            close()
            moveTo(21.999f, 15.752f)
            curveTo(21.999f, 16.582f, 21.549f, 17.308f, 20.879f, 17.698f)
            lineTo(16.01f, 12.828f)
            curveTo(16.489f, 12.941f, 16.987f, 13f, 17.5f, 13f)
            curveTo(19.246f, 13f, 20.831f, 12.312f, 21.999f, 11.191f)
            verticalLineTo(15.752f)
            close()
            moveTo(11f, 6.5f)
            curveTo(11f, 7.012f, 11.059f, 7.511f, 11.172f, 7.989f)
            lineTo(6.182f, 3f)
            horizontalLineTo(12.022f)
            curveTo(11.375f, 4.01f, 11f, 5.211f, 11f, 6.5f)
            close()
            moveTo(23f, 6.5f)
            curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
            curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
            curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
            close()
            moveTo(18f, 3.5f)
            curveTo(18f, 3.224f, 17.776f, 3f, 17.5f, 3f)
            curveTo(17.224f, 3f, 17f, 3.224f, 17f, 3.5f)
            verticalLineTo(8.293f)
            lineTo(15.354f, 6.646f)
            curveTo(15.158f, 6.451f, 14.842f, 6.451f, 14.646f, 6.646f)
            curveTo(14.451f, 6.842f, 14.451f, 7.158f, 14.646f, 7.354f)
            lineTo(17.146f, 9.854f)
            curveTo(17.342f, 10.049f, 17.658f, 10.049f, 17.854f, 9.854f)
            lineTo(20.354f, 7.354f)
            curveTo(20.549f, 7.158f, 20.549f, 6.842f, 20.354f, 6.646f)
            curveTo(20.158f, 6.451f, 19.842f, 6.451f, 19.646f, 6.646f)
            lineTo(18f, 8.293f)
            verticalLineTo(3.5f)
            close()
            moveTo(13.998f, 18.001f)
            lineTo(13.999f, 20.5f)
            horizontalLineTo(9.999f)
            lineTo(9.998f, 18.001f)
            horizontalLineTo(13.998f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DesktopArrowDownOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DesktopArrowDownOff, contentDescription = null)
    }
}
