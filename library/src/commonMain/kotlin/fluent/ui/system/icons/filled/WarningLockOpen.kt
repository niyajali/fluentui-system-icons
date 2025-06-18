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

public val FluentUi.Filled.WarningLockOpen: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WarningLockOpen",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.03f, 2.659f)
            curveTo(9.886f, 1.111f, 12.111f, 1.111f, 12.967f, 2.659f)
            lineTo(18.372f, 12.428f)
            curveTo(18.134f, 12.901f, 18f, 13.435f, 18f, 14f)
            horizontalLineTo(15.5f)
            curveTo(14.119f, 14f, 13f, 15.119f, 13f, 16.5f)
            verticalLineTo(20f)
            horizontalLineTo(3.253f)
            curveTo(1.539f, 20f, 0.455f, 18.16f, 1.284f, 16.66f)
            lineTo(9.03f, 2.659f)
            close()
            moveTo(11.997f, 16.001f)
            curveTo(11.997f, 15.449f, 11.55f, 15.002f, 10.999f, 15.002f)
            curveTo(10.447f, 15.002f, 10f, 15.449f, 10f, 16.001f)
            curveTo(10f, 16.552f, 10.447f, 17f, 10.999f, 17f)
            curveTo(11.55f, 17f, 11.997f, 16.552f, 11.997f, 16.001f)
            close()
            moveTo(11.738f, 8.148f)
            curveTo(11.688f, 7.782f, 11.374f, 7.5f, 10.995f, 7.5f)
            curveTo(10.58f, 7.5f, 10.245f, 7.836f, 10.245f, 8.251f)
            lineTo(10.249f, 12.752f)
            lineTo(10.256f, 12.854f)
            curveTo(10.306f, 13.22f, 10.62f, 13.502f, 10.999f, 13.502f)
            curveTo(11.413f, 13.501f, 11.749f, 13.165f, 11.749f, 12.751f)
            lineTo(11.745f, 8.249f)
            lineTo(11.738f, 8.148f)
            close()
            moveTo(19f, 14f)
            curveTo(19f, 12.619f, 20.119f, 11.5f, 21.5f, 11.5f)
            curveTo(22.881f, 11.5f, 24f, 12.619f, 24f, 14f)
            curveTo(24f, 14.414f, 23.664f, 14.75f, 23.25f, 14.75f)
            curveTo(22.836f, 14.75f, 22.5f, 14.414f, 22.5f, 14f)
            curveTo(22.5f, 13.448f, 22.052f, 13f, 21.5f, 13f)
            curveTo(20.948f, 13f, 20.5f, 13.448f, 20.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 15f, 23f, 15.672f, 23f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
            horizontalLineTo(15.5f)
            curveTo(14.672f, 23f, 14f, 22.328f, 14f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(14f, 15.672f, 14.672f, 15f, 15.5f, 15f)
            horizontalLineTo(19f)
            verticalLineTo(14f)
            close()
            moveTo(18.5f, 20f)
            curveTo(19.052f, 20f, 19.5f, 19.552f, 19.5f, 19f)
            curveTo(19.5f, 18.448f, 19.052f, 18f, 18.5f, 18f)
            curveTo(17.948f, 18f, 17.5f, 18.448f, 17.5f, 19f)
            curveTo(17.5f, 19.552f, 17.948f, 20f, 18.5f, 20f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WarningLockOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WarningLockOpen, contentDescription = null)
    }
}
