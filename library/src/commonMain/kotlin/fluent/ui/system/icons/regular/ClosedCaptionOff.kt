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

public val FluentUi.Regular.ClosedCaptionOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ClosedCaptionOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.47f, 4.53f)
            curveTo(2.585f, 5.111f, 2f, 6.112f, 2f, 7.25f)
            verticalLineTo(16.754f)
            curveTo(2f, 18.549f, 3.455f, 20.004f, 5.25f, 20.004f)
            horizontalLineTo(18.75f)
            curveTo(18.813f, 20.004f, 18.876f, 20.003f, 18.938f, 19.999f)
            lineTo(20.719f, 21.78f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.78f)
            curveTo(22.073f, 21.487f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(17.444f, 18.504f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 18.504f, 3.5f, 17.721f, 3.5f, 16.754f)
            verticalLineTo(7.25f)
            curveTo(3.5f, 6.523f, 3.943f, 5.899f, 4.574f, 5.635f)
            lineTo(7.402f, 8.463f)
            curveTo(6.293f, 9.042f, 5.5f, 10.3f, 5.5f, 12f)
            curveTo(5.5f, 15.143f, 8.215f, 16.775f, 10.621f, 15.406f)
            curveTo(10.981f, 15.202f, 11.107f, 14.744f, 10.902f, 14.384f)
            curveTo(10.697f, 14.024f, 10.239f, 13.898f, 9.879f, 14.103f)
            curveTo(8.484f, 14.896f, 7f, 14.005f, 7f, 12f)
            curveTo(7f, 10.63f, 7.69f, 9.781f, 8.573f, 9.634f)
            lineTo(17.444f, 18.504f)
            close()
            moveTo(20.43f, 17.248f)
            curveTo(20.475f, 17.091f, 20.5f, 16.926f, 20.5f, 16.754f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.283f, 19.716f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(8.682f)
            lineTo(7.182f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(16.754f)
            curveTo(22f, 17.347f, 21.841f, 17.903f, 21.564f, 18.382f)
            lineTo(20.43f, 17.248f)
            close()
            moveTo(14.553f, 11.371f)
            lineTo(13.356f, 10.174f)
            curveTo(14.169f, 8.286f, 16.238f, 7.524f, 18.122f, 8.599f)
            curveTo(18.481f, 8.804f, 18.607f, 9.262f, 18.402f, 9.622f)
            curveTo(18.196f, 9.981f, 17.738f, 10.107f, 17.378f, 9.901f)
            curveTo(16.137f, 9.193f, 14.829f, 9.816f, 14.553f, 11.371f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClosedCaptionOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ClosedCaptionOff, contentDescription = null)
    }
}
