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

public val FluentUi.Filled.BuildingTownhouse: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BuildingTownhouse",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.482f, 3.53f)
            curveTo(7.794f, 2.823f, 6.66f, 2.823f, 5.973f, 3.53f)
            lineTo(3.637f, 5.93f)
            curveTo(3.229f, 6.35f, 3f, 6.913f, 3f, 7.499f)
            verticalLineTo(19.25f)
            curveTo(3f, 20.216f, 3.783f, 21f, 4.75f, 21f)
            horizontalLineTo(8f)
            verticalLineTo(16.75f)
            curveTo(8f, 16.336f, 8.336f, 16f, 8.75f, 16f)
            horizontalLineTo(11.25f)
            verticalLineTo(7.289f)
            curveTo(11.25f, 6.703f, 11.021f, 6.14f, 10.613f, 5.72f)
            lineTo(8.482f, 3.53f)
            close()
            moveTo(12.75f, 7.289f)
            verticalLineTo(16f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 16f, 16f, 16.336f, 16f, 16.75f)
            verticalLineTo(21f)
            horizontalLineTo(19.25f)
            curveTo(20.216f, 21f, 21f, 20.216f, 21f, 19.25f)
            verticalLineTo(7.499f)
            curveTo(21f, 6.913f, 20.771f, 6.35f, 20.363f, 5.93f)
            lineTo(18.027f, 3.53f)
            curveTo(17.34f, 2.823f, 16.205f, 2.823f, 15.518f, 3.53f)
            lineTo(13.387f, 5.72f)
            curveTo(12.979f, 6.14f, 12.75f, 6.703f, 12.75f, 7.289f)
            close()
            moveTo(12.75f, 17.5f)
            verticalLineTo(21f)
            horizontalLineTo(14.5f)
            verticalLineTo(17.5f)
            horizontalLineTo(12.75f)
            close()
            moveTo(11.25f, 21f)
            verticalLineTo(17.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(21f)
            horizontalLineTo(11.25f)
            close()
            moveTo(8.125f, 9f)
            curveTo(8.125f, 9.552f, 7.677f, 10f, 7.125f, 10f)
            curveTo(6.573f, 10f, 6.125f, 9.552f, 6.125f, 9f)
            curveTo(6.125f, 8.448f, 6.573f, 8f, 7.125f, 8f)
            curveTo(7.677f, 8f, 8.125f, 8.448f, 8.125f, 9f)
            close()
            moveTo(16.875f, 10f)
            curveTo(16.323f, 10f, 15.875f, 9.552f, 15.875f, 9f)
            curveTo(15.875f, 8.448f, 16.323f, 8f, 16.875f, 8f)
            curveTo(17.427f, 8f, 17.875f, 8.448f, 17.875f, 9f)
            curveTo(17.875f, 9.552f, 17.427f, 10f, 16.875f, 10f)
            close()
            moveTo(8.125f, 12.997f)
            curveTo(8.125f, 13.549f, 7.677f, 13.997f, 7.125f, 13.997f)
            curveTo(6.573f, 13.997f, 6.125f, 13.549f, 6.125f, 12.997f)
            curveTo(6.125f, 12.444f, 6.573f, 11.997f, 7.125f, 11.997f)
            curveTo(7.677f, 11.997f, 8.125f, 12.444f, 8.125f, 12.997f)
            close()
            moveTo(16.875f, 13.997f)
            curveTo(16.323f, 13.997f, 15.875f, 13.549f, 15.875f, 12.997f)
            curveTo(15.875f, 12.444f, 16.323f, 11.997f, 16.875f, 11.997f)
            curveTo(17.427f, 11.997f, 17.875f, 12.444f, 17.875f, 12.997f)
            curveTo(17.875f, 13.549f, 17.427f, 13.997f, 16.875f, 13.997f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingTownhousePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BuildingTownhouse, contentDescription = null)
    }
}
