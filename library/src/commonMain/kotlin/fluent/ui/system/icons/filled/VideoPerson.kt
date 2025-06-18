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

public val FluentUi.Filled.VideoPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.745f, 4f)
            curveTo(20.988f, 4f, 21.995f, 5.007f, 21.995f, 6.25f)
            verticalLineTo(17.755f)
            curveTo(21.995f, 18.997f, 20.988f, 20.005f, 19.745f, 20.005f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.745f)
            close()
            moveTo(19.745f, 5.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineTo(17.755f)
            curveTo(3.5f, 18.169f, 3.836f, 18.505f, 4.25f, 18.505f)
            lineTo(6.999f, 18.504f)
            lineTo(7f, 15.75f)
            curveTo(7f, 14.832f, 7.707f, 14.079f, 8.606f, 14.006f)
            lineTo(8.75f, 14f)
            horizontalLineTo(15.245f)
            curveTo(16.163f, 14f, 16.916f, 14.707f, 16.989f, 15.606f)
            lineTo(16.995f, 15.75f)
            lineTo(16.994f, 18.504f)
            lineTo(19.745f, 18.505f)
            curveTo(20.16f, 18.505f, 20.495f, 18.169f, 20.495f, 17.755f)
            verticalLineTo(6.25f)
            curveTo(20.495f, 5.836f, 20.16f, 5.5f, 19.745f, 5.5f)
            close()
            moveTo(12f, 7f)
            curveTo(13.657f, 7f, 15f, 8.344f, 15f, 10f)
            curveTo(15f, 11.657f, 13.657f, 13f, 12f, 13f)
            curveTo(10.343f, 13f, 9f, 11.657f, 9f, 10f)
            curveTo(9f, 8.344f, 10.343f, 7f, 12f, 7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VideoPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.VideoPerson, contentDescription = null)
    }
}
