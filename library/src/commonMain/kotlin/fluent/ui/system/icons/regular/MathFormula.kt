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

public val FluentUi.Regular.MathFormula: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MathFormula",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.482f, 3.827f)
            curveTo(11.369f, 3.003f, 9.786f, 3.736f, 9.694f, 5.117f)
            lineTo(9.535f, 7.5f)
            horizontalLineTo(12.25f)
            curveTo(12.664f, 7.5f, 13f, 7.836f, 13f, 8.25f)
            curveTo(13f, 8.664f, 12.664f, 9f, 12.25f, 9f)
            horizontalLineTo(9.435f)
            lineTo(8.835f, 18.006f)
            curveTo(8.656f, 20.691f, 5.477f, 22.007f, 3.452f, 20.235f)
            lineTo(3.256f, 20.064f)
            curveTo(2.944f, 19.791f, 2.913f, 19.318f, 3.186f, 19.006f)
            curveTo(3.458f, 18.694f, 3.932f, 18.663f, 4.244f, 18.935f)
            lineTo(4.439f, 19.106f)
            curveTo(5.53f, 20.061f, 7.242f, 19.352f, 7.338f, 17.906f)
            lineTo(7.932f, 9f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 9f, 5f, 8.664f, 5f, 8.25f)
            curveTo(5f, 7.836f, 5.336f, 7.5f, 5.75f, 7.5f)
            horizontalLineTo(8.032f)
            lineTo(8.197f, 5.017f)
            curveTo(8.368f, 2.452f, 11.309f, 1.091f, 13.375f, 2.622f)
            lineTo(13.746f, 2.897f)
            curveTo(14.079f, 3.144f, 14.149f, 3.613f, 13.903f, 3.946f)
            curveTo(13.656f, 4.279f, 13.186f, 4.349f, 12.854f, 4.102f)
            lineTo(12.482f, 3.827f)
            close()
            moveTo(13.712f, 12.763f)
            curveTo(13.488f, 12.337f, 12.926f, 12.23f, 12.56f, 12.543f)
            lineTo(12.238f, 12.819f)
            curveTo(11.924f, 13.089f, 11.45f, 13.052f, 11.181f, 12.738f)
            curveTo(10.911f, 12.423f, 10.947f, 11.95f, 11.262f, 11.68f)
            lineTo(11.584f, 11.404f)
            curveTo(12.681f, 10.464f, 14.367f, 10.786f, 15.04f, 12.064f)
            lineTo(16.017f, 13.922f)
            lineTo(18.72f, 11.219f)
            curveTo(19.013f, 10.927f, 19.487f, 10.927f, 19.78f, 11.219f)
            curveTo(20.073f, 11.512f, 20.073f, 11.987f, 19.78f, 12.28f)
            lineTo(16.749f, 15.312f)
            lineTo(18.288f, 18.236f)
            curveTo(18.512f, 18.663f, 19.074f, 18.77f, 19.44f, 18.456f)
            lineTo(19.762f, 18.18f)
            curveTo(20.076f, 17.911f, 20.55f, 17.947f, 20.819f, 18.262f)
            curveTo(21.089f, 18.576f, 21.053f, 19.05f, 20.738f, 19.319f)
            lineTo(20.416f, 19.595f)
            curveTo(19.319f, 20.535f, 17.633f, 20.213f, 16.961f, 18.935f)
            lineTo(15.638f, 16.422f)
            lineTo(12.28f, 19.78f)
            curveTo(11.988f, 20.073f, 11.513f, 20.073f, 11.22f, 19.78f)
            curveTo(10.927f, 19.487f, 10.927f, 19.012f, 11.22f, 18.719f)
            lineTo(14.907f, 15.033f)
            lineTo(13.712f, 12.763f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MathFormulaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MathFormula, contentDescription = null)
    }
}
