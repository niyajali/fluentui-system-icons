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

public val FluentUi.Filled.PlantCattail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlantCattail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 5f)
            curveTo(9f, 3.343f, 10.343f, 2f, 12f, 2f)
            curveTo(13.657f, 2f, 15f, 3.343f, 15f, 5f)
            verticalLineTo(9f)
            curveTo(15f, 10.398f, 14.044f, 11.573f, 12.75f, 11.906f)
            verticalLineTo(14.689f)
            lineTo(16.22f, 11.22f)
            curveTo(16.513f, 10.927f, 16.987f, 10.927f, 17.28f, 11.22f)
            curveTo(17.573f, 11.513f, 17.573f, 11.987f, 17.28f, 12.28f)
            lineTo(12.75f, 16.811f)
            verticalLineTo(18.25f)
            curveTo(12.75f, 18.664f, 12.414f, 19f, 12f, 19f)
            curveTo(11.586f, 19f, 11.25f, 18.664f, 11.25f, 18.25f)
            verticalLineTo(16.811f)
            lineTo(6.72f, 12.28f)
            curveTo(6.427f, 11.987f, 6.427f, 11.513f, 6.72f, 11.22f)
            curveTo(7.013f, 10.927f, 7.487f, 10.927f, 7.78f, 11.22f)
            lineTo(11.25f, 14.689f)
            verticalLineTo(11.906f)
            curveTo(9.956f, 11.573f, 9f, 10.398f, 9f, 9f)
            verticalLineTo(5f)
            close()
            moveTo(7.522f, 14.497f)
            curveTo(6.933f, 14.639f, 6.385f, 14.809f, 5.891f, 15.004f)
            curveTo(5.093f, 15.318f, 4.397f, 15.711f, 3.887f, 16.186f)
            curveTo(3.376f, 16.662f, 3f, 17.274f, 3f, 18f)
            curveTo(3f, 18.726f, 3.376f, 19.338f, 3.887f, 19.814f)
            curveTo(4.397f, 20.288f, 5.093f, 20.681f, 5.891f, 20.996f)
            curveTo(7.492f, 21.626f, 9.652f, 22f, 12f, 22f)
            curveTo(14.348f, 22f, 16.508f, 21.626f, 18.108f, 20.996f)
            curveTo(18.907f, 20.681f, 19.603f, 20.288f, 20.113f, 19.814f)
            curveTo(20.624f, 19.338f, 21f, 18.726f, 21f, 18f)
            curveTo(21f, 17.274f, 20.624f, 16.662f, 20.113f, 16.186f)
            curveTo(19.603f, 15.711f, 18.907f, 15.318f, 18.108f, 15.004f)
            curveTo(17.615f, 14.809f, 17.067f, 14.639f, 16.478f, 14.497f)
            lineTo(15.209f, 15.766f)
            curveTo(16.101f, 15.921f, 16.896f, 16.139f, 17.559f, 16.4f)
            curveTo(18.254f, 16.673f, 18.765f, 16.981f, 19.09f, 17.284f)
            curveTo(19.415f, 17.586f, 19.5f, 17.828f, 19.5f, 18f)
            curveTo(19.5f, 18.172f, 19.415f, 18.414f, 19.09f, 18.716f)
            curveTo(18.765f, 19.019f, 18.254f, 19.326f, 17.559f, 19.6f)
            curveTo(16.173f, 20.146f, 14.208f, 20.5f, 12f, 20.5f)
            curveTo(9.792f, 20.5f, 7.827f, 20.146f, 6.441f, 19.6f)
            curveTo(5.746f, 19.326f, 5.235f, 19.019f, 4.909f, 18.716f)
            curveTo(4.585f, 18.414f, 4.5f, 18.172f, 4.5f, 18f)
            curveTo(4.5f, 17.828f, 4.585f, 17.586f, 4.909f, 17.284f)
            curveTo(5.235f, 16.981f, 5.746f, 16.673f, 6.441f, 16.4f)
            curveTo(7.104f, 16.139f, 7.9f, 15.921f, 8.791f, 15.766f)
            lineTo(7.522f, 14.497f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlantCattailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PlantCattail, contentDescription = null)
    }
}
