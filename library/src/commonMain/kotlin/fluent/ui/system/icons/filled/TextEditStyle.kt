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

public val FluentUi.Filled.TextEditStyle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextEditStyle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.063f, 8.445f)
            curveTo(21.319f, 9.702f, 21.318f, 11.74f, 20.061f, 12.996f)
            lineTo(12.947f, 20.098f)
            curveTo(12.675f, 20.37f, 12.339f, 20.567f, 11.969f, 20.671f)
            lineTo(7.356f, 21.975f)
            curveTo(6.785f, 22.136f, 6.262f, 21.601f, 6.435f, 21.034f)
            lineTo(7.823f, 16.49f)
            curveTo(7.93f, 16.137f, 8.123f, 15.816f, 8.385f, 15.555f)
            lineTo(15.509f, 8.443f)
            curveTo(16.767f, 7.186f, 18.806f, 7.188f, 20.063f, 8.445f)
            close()
            moveTo(8.151f, 2.37f)
            lineTo(8.202f, 2.475f)
            lineTo(11.454f, 10.724f)
            lineTo(10.297f, 11.879f)
            lineTo(9.556f, 10f)
            horizontalLineTo(5.443f)
            lineTo(4.448f, 12.521f)
            curveTo(4.308f, 12.874f, 3.93f, 13.062f, 3.572f, 12.974f)
            lineTo(3.474f, 12.943f)
            curveTo(3.121f, 12.803f, 2.933f, 12.425f, 3.022f, 12.067f)
            lineTo(3.053f, 11.969f)
            lineTo(6.806f, 2.474f)
            curveTo(7.042f, 1.879f, 7.849f, 1.844f, 8.151f, 2.37f)
            close()
            moveTo(7.503f, 4.792f)
            lineTo(6.036f, 8.5f)
            horizontalLineTo(8.964f)
            lineTo(7.503f, 4.792f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextEditStylePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextEditStyle, contentDescription = null)
    }
}
