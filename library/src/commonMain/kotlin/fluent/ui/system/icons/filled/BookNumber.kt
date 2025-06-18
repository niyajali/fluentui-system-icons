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

public val FluentUi.Filled.BookNumber: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookNumber",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.978f, 9.98f)
            horizontalLineTo(13.469f)
            lineTo(13.106f, 11.566f)
            horizontalLineTo(11.59f)
            lineTo(11.978f, 9.98f)
            close()
            moveTo(4f, 4.5f)
            curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
            horizontalLineTo(18f)
            curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
            verticalLineTo(18.75f)
            curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
            horizontalLineTo(5.5f)
            curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
            curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
            horizontalLineTo(6.5f)
            curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
            verticalLineTo(4.5f)
            close()
            moveTo(11.024f, 7.571f)
            lineTo(10.801f, 8.48f)
            lineTo(9.731f, 8.48f)
            lineTo(9.629f, 8.487f)
            curveTo(9.263f, 8.537f, 8.981f, 8.851f, 8.981f, 9.23f)
            lineTo(8.988f, 9.332f)
            curveTo(9.037f, 9.698f, 9.351f, 9.98f, 9.731f, 9.98f)
            lineTo(10.434f, 9.98f)
            lineTo(10.046f, 11.566f)
            lineTo(9.25f, 11.567f)
            lineTo(9.148f, 11.574f)
            curveTo(8.782f, 11.624f, 8.5f, 11.937f, 8.5f, 12.317f)
            lineTo(8.507f, 12.419f)
            curveTo(8.557f, 12.785f, 8.87f, 13.067f, 9.25f, 13.067f)
            lineTo(9.679f, 13.066f)
            lineTo(9.556f, 13.573f)
            lineTo(9.538f, 13.674f)
            curveTo(9.5f, 14.041f, 9.737f, 14.39f, 10.106f, 14.48f)
            lineTo(10.207f, 14.498f)
            curveTo(10.574f, 14.536f, 10.923f, 14.299f, 11.013f, 13.93f)
            lineTo(11.223f, 13.066f)
            horizontalLineTo(12.762f)
            lineTo(12.644f, 13.584f)
            lineTo(12.628f, 13.685f)
            curveTo(12.595f, 14.053f, 12.838f, 14.398f, 13.208f, 14.483f)
            lineTo(13.309f, 14.499f)
            curveTo(13.677f, 14.532f, 14.022f, 14.289f, 14.106f, 13.919f)
            lineTo(14.301f, 13.066f)
            lineTo(15.242f, 13.067f)
            lineTo(15.343f, 13.06f)
            curveTo(15.709f, 13.011f, 15.992f, 12.697f, 15.992f, 12.317f)
            lineTo(15.985f, 12.215f)
            curveTo(15.935f, 11.849f, 15.621f, 11.567f, 15.242f, 11.567f)
            lineTo(14.645f, 11.566f)
            lineTo(15.008f, 9.98f)
            lineTo(15.728f, 9.98f)
            lineTo(15.83f, 9.973f)
            curveTo(16.196f, 9.924f, 16.478f, 9.61f, 16.478f, 9.23f)
            lineTo(16.471f, 9.129f)
            curveTo(16.421f, 8.762f, 16.108f, 8.48f, 15.728f, 8.48f)
            lineTo(15.352f, 8.48f)
            lineTo(15.482f, 7.916f)
            lineTo(15.498f, 7.815f)
            curveTo(15.531f, 7.448f, 15.288f, 7.102f, 14.918f, 7.018f)
            lineTo(14.818f, 7.002f)
            curveTo(14.45f, 6.968f, 14.104f, 7.211f, 14.02f, 7.581f)
            lineTo(13.813f, 8.48f)
            horizontalLineTo(12.345f)
            lineTo(12.481f, 7.927f)
            lineTo(12.499f, 7.826f)
            curveTo(12.538f, 7.459f, 12.3f, 7.11f, 11.931f, 7.02f)
            curveTo(11.529f, 6.922f, 11.123f, 7.168f, 11.024f, 7.571f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookNumberPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BookNumber, contentDescription = null)
    }
}
