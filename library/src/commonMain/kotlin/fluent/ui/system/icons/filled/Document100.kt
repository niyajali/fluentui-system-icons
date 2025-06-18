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

public val FluentUi.Filled.Document100: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Document100",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.896f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(14.228f)
            curveTo(4.338f, 14.425f, 4.679f, 14.742f, 4.862f, 15.199f)
            curveTo(5.504f, 14.464f, 6.448f, 14f, 7.5f, 14f)
            curveTo(8.773f, 14f, 9.888f, 14.68f, 10.5f, 15.696f)
            curveTo(11.113f, 14.68f, 12.227f, 14f, 13.5f, 14f)
            curveTo(15.433f, 14f, 17f, 15.567f, 17f, 17.5f)
            verticalLineTo(19.5f)
            curveTo(17f, 20.479f, 16.598f, 21.365f, 15.95f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.896f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
            moveTo(7.5f, 15f)
            curveTo(6.119f, 15f, 5f, 16.119f, 5f, 17.5f)
            verticalLineTo(19.5f)
            curveTo(5f, 20.881f, 6.119f, 22f, 7.5f, 22f)
            curveTo(8.881f, 22f, 10f, 20.881f, 10f, 19.5f)
            verticalLineTo(17.5f)
            curveTo(10f, 16.119f, 8.881f, 15f, 7.5f, 15f)
            close()
            moveTo(6.5f, 17.5f)
            curveTo(6.5f, 16.948f, 6.948f, 16.5f, 7.5f, 16.5f)
            curveTo(8.052f, 16.5f, 8.5f, 16.948f, 8.5f, 17.5f)
            verticalLineTo(19.5f)
            curveTo(8.5f, 20.052f, 8.052f, 20.5f, 7.5f, 20.5f)
            curveTo(6.948f, 20.5f, 6.5f, 20.052f, 6.5f, 19.5f)
            verticalLineTo(17.5f)
            close()
            moveTo(11f, 17.5f)
            curveTo(11f, 16.119f, 12.119f, 15f, 13.5f, 15f)
            curveTo(14.881f, 15f, 16f, 16.119f, 16f, 17.5f)
            verticalLineTo(19.5f)
            curveTo(16f, 20.881f, 14.881f, 22f, 13.5f, 22f)
            curveTo(12.119f, 22f, 11f, 20.881f, 11f, 19.5f)
            verticalLineTo(17.5f)
            close()
            moveTo(13.5f, 16.5f)
            curveTo(12.948f, 16.5f, 12.5f, 16.948f, 12.5f, 17.5f)
            verticalLineTo(19.5f)
            curveTo(12.5f, 20.052f, 12.948f, 20.5f, 13.5f, 20.5f)
            curveTo(14.052f, 20.5f, 14.5f, 20.052f, 14.5f, 19.5f)
            verticalLineTo(17.5f)
            curveTo(14.5f, 16.948f, 14.052f, 16.5f, 13.5f, 16.5f)
            close()
            moveTo(4f, 15.938f)
            curveTo(4f, 15.376f, 3.567f, 15.074f, 3.258f, 14.987f)
            curveTo(2.949f, 14.9f, 2.454f, 14.931f, 2.147f, 15.358f)
            curveTo(1.83f, 15.801f, 1.388f, 16.297f, 0.868f, 16.604f)
            curveTo(0.512f, 16.815f, 0.394f, 17.275f, 0.605f, 17.632f)
            curveTo(0.816f, 17.988f, 1.276f, 18.106f, 1.632f, 17.896f)
            curveTo(1.955f, 17.704f, 2.245f, 17.474f, 2.5f, 17.233f)
            verticalLineTo(21.25f)
            curveTo(2.5f, 21.664f, 2.836f, 22f, 3.25f, 22f)
            curveTo(3.664f, 22f, 4f, 21.664f, 4f, 21.25f)
            verticalLineTo(15.938f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Document100Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Document100, contentDescription = null)
    }
}
