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

public val FluentUi.Regular.BriefcaseOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BriefcaseOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.135f, 6.196f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.513f, 2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            curveTo(22.073f, 21.013f, 22.073f, 21.488f, 21.78f, 21.781f)
            curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.781f)
            lineTo(18.774f, 19.835f)
            curveTo(18.452f, 19.942f, 18.108f, 20f, 17.75f, 20f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 20f, 3f, 18.545f, 3f, 16.75f)
            verticalLineTo(8.75f)
            curveTo(3f, 8.59f, 3.05f, 8.443f, 3.135f, 8.321f)
            curveTo(3.428f, 7.336f, 4.176f, 6.546f, 5.135f, 6.196f)
            close()
            moveTo(17.439f, 18.5f)
            lineTo(13.322f, 14.383f)
            curveTo(13.235f, 14.456f, 13.123f, 14.5f, 13f, 14.5f)
            horizontalLineTo(11f)
            curveTo(10.724f, 14.5f, 10.5f, 14.276f, 10.5f, 14f)
            horizontalLineTo(6.25f)
            curveTo(5.606f, 14f, 5.005f, 13.813f, 4.5f, 13.489f)
            verticalLineTo(16.75f)
            curveTo(4.5f, 17.716f, 5.284f, 18.5f, 6.25f, 18.5f)
            horizontalLineTo(17.439f)
            close()
            moveTo(10.617f, 11.678f)
            lineTo(6.439f, 7.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 7.5f, 4.5f, 8.283f, 4.5f, 9.25f)
            verticalLineTo(10.75f)
            curveTo(4.5f, 11.717f, 5.284f, 12.5f, 6.25f, 12.5f)
            horizontalLineTo(10.5f)
            verticalLineTo(12f)
            curveTo(10.5f, 11.877f, 10.544f, 11.765f, 10.617f, 11.678f)
            close()
            moveTo(17.75f, 12.5f)
            horizontalLineTo(15.682f)
            lineTo(17.182f, 14f)
            horizontalLineTo(17.75f)
            curveTo(18.394f, 14f, 18.995f, 13.813f, 19.5f, 13.489f)
            verticalLineTo(16.318f)
            lineTo(20.864f, 17.683f)
            curveTo(20.953f, 17.387f, 21f, 17.074f, 21f, 16.75f)
            verticalLineTo(8.75f)
            curveTo(21f, 8.59f, 20.95f, 8.443f, 20.865f, 8.321f)
            curveTo(20.466f, 6.979f, 19.222f, 6f, 17.75f, 6f)
            horizontalLineTo(16f)
            verticalLineTo(4.25f)
            curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
            verticalLineTo(4.818f)
            lineTo(10.682f, 7.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 7.5f, 19.5f, 8.283f, 19.5f, 9.25f)
            verticalLineTo(10.75f)
            curveTo(19.5f, 11.717f, 18.716f, 12.5f, 17.75f, 12.5f)
            close()
            moveTo(9.5f, 4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(9.5f)
            verticalLineTo(4.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BriefcaseOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BriefcaseOff, contentDescription = null)
    }
}
