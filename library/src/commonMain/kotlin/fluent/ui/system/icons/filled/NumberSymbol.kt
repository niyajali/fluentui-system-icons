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

public val FluentUi.Filled.NumberSymbol: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberSymbol",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.985f, 3.165f)
            curveTo(11.076f, 2.62f, 10.708f, 2.105f, 10.163f, 2.014f)
            curveTo(9.618f, 1.923f, 9.103f, 2.291f, 9.012f, 2.836f)
            lineTo(8.151f, 7.998f)
            lineTo(3.999f, 8f)
            curveTo(3.447f, 8f, 3f, 8.448f, 3f, 9.001f)
            curveTo(3f, 9.553f, 3.448f, 10f, 4.001f, 10f)
            lineTo(7.818f, 9.998f)
            lineTo(7.151f, 13.998f)
            lineTo(3f, 14f)
            curveTo(2.447f, 14f, 2f, 14.448f, 2f, 15.001f)
            curveTo(2f, 15.553f, 2.448f, 16f, 3f, 16f)
            lineTo(6.817f, 15.998f)
            lineTo(6.01f, 20.836f)
            curveTo(5.919f, 21.38f, 6.287f, 21.896f, 6.832f, 21.986f)
            curveTo(7.377f, 22.077f, 7.892f, 21.709f, 7.983f, 21.165f)
            lineTo(8.845f, 15.998f)
            lineTo(13.82f, 15.995f)
            lineTo(13.014f, 20.836f)
            curveTo(12.923f, 21.381f, 13.291f, 21.896f, 13.836f, 21.986f)
            curveTo(14.38f, 22.077f, 14.896f, 21.709f, 14.986f, 21.165f)
            lineTo(15.848f, 15.994f)
            lineTo(20f, 15.993f)
            curveTo(20.553f, 15.992f, 21f, 15.544f, 21f, 14.992f)
            curveTo(21f, 14.44f, 20.552f, 13.992f, 20f, 13.993f)
            lineTo(16.181f, 13.994f)
            lineTo(16.848f, 9.993f)
            lineTo(21f, 9.99f)
            curveTo(21.553f, 9.99f, 22f, 9.542f, 22f, 8.99f)
            curveTo(22f, 8.437f, 21.552f, 7.99f, 20.999f, 7.99f)
            lineTo(17.182f, 7.992f)
            lineTo(17.986f, 3.165f)
            curveTo(18.077f, 2.62f, 17.709f, 2.105f, 17.164f, 2.014f)
            curveTo(16.62f, 1.923f, 16.104f, 2.291f, 16.014f, 2.836f)
            lineTo(15.154f, 7.994f)
            lineTo(10.179f, 7.997f)
            lineTo(10.985f, 3.165f)
            close()
            moveTo(9.845f, 9.997f)
            lineTo(14.821f, 9.994f)
            lineTo(14.154f, 13.995f)
            lineTo(9.178f, 13.997f)
            lineTo(9.845f, 9.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberSymbolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NumberSymbol, contentDescription = null)
    }
}
