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

public val FluentUi.Filled.RealEstate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RealEstate",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 21.5f)
            verticalLineTo(3f)
            curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
            curveTo(3.552f, 2f, 4f, 2.448f, 4f, 3f)
            verticalLineTo(3.955f)
            horizontalLineTo(20.978f)
            curveTo(21.542f, 3.955f, 22f, 4.413f, 22f, 4.978f)
            curveTo(22f, 5.542f, 21.542f, 6f, 20.978f, 6f)
            horizontalLineTo(4f)
            verticalLineTo(21.5f)
            curveTo(4f, 21.776f, 3.776f, 22f, 3.5f, 22f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 22f, 2f, 21.776f, 2f, 21.5f)
            close()
            moveTo(5f, 7.5f)
            curveTo(5f, 7.224f, 5.224f, 7f, 5.5f, 7f)
            horizontalLineTo(19.5f)
            curveTo(19.776f, 7f, 20f, 7.224f, 20f, 7.5f)
            verticalLineTo(15.25f)
            curveTo(20f, 17.321f, 18.321f, 19f, 16.25f, 19f)
            horizontalLineTo(8.75f)
            curveTo(6.679f, 19f, 5f, 17.321f, 5f, 15.25f)
            verticalLineTo(7.5f)
            close()
            moveTo(9.349f, 11.701f)
            curveTo(9.128f, 11.891f, 9f, 12.168f, 9f, 12.46f)
            verticalLineTo(15.5f)
            curveTo(9f, 15.776f, 9.224f, 16f, 9.5f, 16f)
            horizontalLineTo(11.25f)
            curveTo(11.388f, 16f, 11.5f, 15.888f, 11.5f, 15.75f)
            verticalLineTo(14.5f)
            curveTo(11.5f, 14.224f, 11.724f, 14f, 12f, 14f)
            horizontalLineTo(13f)
            curveTo(13.276f, 14f, 13.5f, 14.224f, 13.5f, 14.5f)
            verticalLineTo(15.75f)
            curveTo(13.5f, 15.888f, 13.612f, 16f, 13.75f, 16f)
            horizontalLineTo(15.5f)
            curveTo(15.776f, 16f, 16f, 15.776f, 16f, 15.5f)
            verticalLineTo(12.46f)
            curveTo(16f, 12.168f, 15.872f, 11.891f, 15.651f, 11.701f)
            lineTo(12.825f, 9.279f)
            curveTo(12.638f, 9.119f, 12.362f, 9.119f, 12.175f, 9.279f)
            lineTo(9.349f, 11.701f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RealEstatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RealEstate, contentDescription = null)
    }
}
