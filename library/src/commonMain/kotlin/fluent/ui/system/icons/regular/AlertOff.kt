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

public val FluentUi.Regular.AlertOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlertOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.219f, 6.28f)
            lineTo(2.22f, 3.28f)
            curveTo(1.927f, 2.987f, 1.927f, 2.512f, 2.22f, 2.22f)
            curveTo(2.513f, 1.927f, 2.987f, 1.927f, 3.28f, 2.22f)
            lineTo(21.78f, 20.72f)
            curveTo(22.073f, 21.013f, 22.073f, 21.487f, 21.78f, 21.78f)
            curveTo(21.487f, 22.073f, 21.012f, 22.073f, 20.719f, 21.78f)
            lineTo(17.44f, 18.501f)
            lineTo(15f, 18.501f)
            curveTo(15f, 20.158f, 13.657f, 21.501f, 12f, 21.501f)
            curveTo(10.402f, 21.501f, 9.096f, 20.252f, 9.005f, 18.678f)
            lineTo(9f, 18.499f)
            lineTo(4.275f, 18.5f)
            curveTo(4.104f, 18.5f, 3.934f, 18.465f, 3.777f, 18.396f)
            curveTo(3.144f, 18.121f, 2.853f, 17.385f, 3.128f, 16.752f)
            lineTo(4.5f, 13.594f)
            verticalLineTo(9.496f)
            curveTo(4.5f, 8.344f, 4.758f, 7.254f, 5.219f, 6.28f)
            close()
            moveTo(15.939f, 17f)
            lineTo(6.365f, 7.425f)
            curveTo(6.129f, 8.07f, 6f, 8.767f, 6f, 9.496f)
            verticalLineTo(13.906f)
            lineTo(4.656f, 17f)
            horizontalLineTo(15.939f)
            close()
            moveTo(13.5f, 18.499f)
            lineTo(10.5f, 18.501f)
            curveTo(10.5f, 19.33f, 11.172f, 20.001f, 12f, 20.001f)
            curveTo(12.78f, 20.001f, 13.421f, 19.406f, 13.493f, 18.646f)
            lineTo(13.5f, 18.499f)
            close()
            moveTo(18f, 13.907f)
            lineTo(18.708f, 15.527f)
            lineTo(20.896f, 17.714f)
            curveTo(20.953f, 17.57f, 20.985f, 17.414f, 20.985f, 17.25f)
            curveTo(20.985f, 17.077f, 20.949f, 16.907f, 20.88f, 16.749f)
            lineTo(19.5f, 13.593f)
            verticalLineTo(9.496f)
            lineTo(19.496f, 9.245f)
            curveTo(19.357f, 5.191f, 16.05f, 1.996f, 12f, 1.996f)
            curveTo(10.098f, 1.996f, 8.364f, 2.699f, 7.043f, 3.861f)
            lineTo(8.107f, 4.925f)
            curveTo(9.154f, 4.033f, 10.513f, 3.496f, 12f, 3.496f)
            curveTo(15.242f, 3.496f, 17.885f, 6.05f, 17.997f, 9.284f)
            lineTo(18f, 9.509f)
            lineTo(18f, 13.907f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AlertOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.AlertOff, contentDescription = null)
    }
}
