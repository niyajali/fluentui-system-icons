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

public val FluentUi.Regular.AppsAddInOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AppsAddInOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.219f, 4.28f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
            curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
            lineTo(19.72f, 20.781f)
            curveTo(19.426f, 20.921f, 19.097f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(4.007f, 21f, 3f, 19.993f, 3f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(3f, 4.903f, 3.079f, 4.574f, 3.219f, 4.28f)
            close()
            moveTo(18.439f, 19.5f)
            lineTo(12.749f, 13.81f)
            verticalLineTo(19.5f)
            horizontalLineTo(18.439f)
            close()
            moveTo(10.189f, 11.25f)
            lineTo(4.5f, 5.561f)
            verticalLineTo(11.25f)
            horizontalLineTo(10.189f)
            close()
            moveTo(11.25f, 5.25f)
            verticalLineTo(8.068f)
            lineTo(12.75f, 9.569f)
            verticalLineTo(5.25f)
            curveTo(12.75f, 4.007f, 11.743f, 3f, 10.5f, 3f)
            horizontalLineTo(6.182f)
            lineTo(7.682f, 4.5f)
            horizontalLineTo(10.5f)
            curveTo(10.914f, 4.5f, 11.25f, 4.836f, 11.25f, 5.25f)
            close()
            moveTo(15.931f, 12.75f)
            lineTo(14.431f, 11.25f)
            horizontalLineTo(18.75f)
            curveTo(19.993f, 11.25f, 21f, 12.257f, 21f, 13.5f)
            verticalLineTo(17.819f)
            lineTo(19.5f, 16.319f)
            verticalLineTo(13.5f)
            curveTo(19.5f, 13.086f, 19.164f, 12.75f, 18.75f, 12.75f)
            horizontalLineTo(15.931f)
            close()
            moveTo(11.25f, 12.75f)
            horizontalLineTo(4.5f)
            verticalLineTo(18.75f)
            curveTo(4.5f, 19.164f, 4.836f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(11.249f)
            lineTo(11.25f, 12.75f)
            close()
            moveTo(17.898f, 2.007f)
            lineTo(18f, 2f)
            curveTo(18.38f, 2f, 18.694f, 2.282f, 18.743f, 2.648f)
            lineTo(18.75f, 2.75f)
            verticalLineTo(5.25f)
            horizontalLineTo(21.25f)
            curveTo(21.63f, 5.25f, 21.944f, 5.532f, 21.993f, 5.898f)
            lineTo(22f, 6f)
            curveTo(22f, 6.38f, 21.718f, 6.693f, 21.352f, 6.743f)
            lineTo(21.25f, 6.75f)
            horizontalLineTo(18.75f)
            verticalLineTo(9.25f)
            curveTo(18.75f, 9.63f, 18.468f, 9.943f, 18.102f, 9.993f)
            lineTo(18f, 10f)
            curveTo(17.62f, 10f, 17.306f, 9.718f, 17.257f, 9.352f)
            lineTo(17.25f, 9.25f)
            verticalLineTo(6.75f)
            horizontalLineTo(14.75f)
            curveTo(14.37f, 6.75f, 14.057f, 6.468f, 14.007f, 6.102f)
            lineTo(14f, 6f)
            curveTo(14f, 5.62f, 14.282f, 5.307f, 14.648f, 5.257f)
            lineTo(14.75f, 5.25f)
            horizontalLineTo(17.25f)
            verticalLineTo(2.75f)
            curveTo(17.25f, 2.37f, 17.532f, 2.057f, 17.898f, 2.007f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AppsAddInOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AppsAddInOff, contentDescription = null)
    }
}
