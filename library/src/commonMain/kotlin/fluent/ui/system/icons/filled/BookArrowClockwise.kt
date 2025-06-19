package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.BookArrowClockwise: ImageVector
    get() {
        if (_BookArrowClockwise != null) {
            return _BookArrowClockwise!!
        }
        _BookArrowClockwise = ImageVector.Builder(
            name = "Filled.BookArrowClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 4.25f)
                curveTo(22f, 4.664f, 21.664f, 5f, 21.25f, 5f)
                horizontalLineTo(18.5f)
                curveTo(18.086f, 5f, 17.75f, 4.664f, 17.75f, 4.25f)
                curveTo(17.75f, 3.836f, 18.086f, 3.5f, 18.5f, 3.5f)
                horizontalLineTo(19.829f)
                lineTo(19.822f, 3.494f)
                lineTo(19.812f, 3.487f)
                curveTo(19.042f, 2.869f, 18.065f, 2.5f, 17f, 2.5f)
                curveTo(14.515f, 2.5f, 12.5f, 4.515f, 12.5f, 7f)
                curveTo(12.5f, 9.485f, 14.515f, 11.5f, 17f, 11.5f)
                curveTo(19.485f, 11.5f, 21.5f, 9.485f, 21.5f, 7f)
                curveTo(21.5f, 6.586f, 21.836f, 6.25f, 22.25f, 6.25f)
                curveTo(22.664f, 6.25f, 23f, 6.586f, 23f, 7f)
                curveTo(23f, 10.314f, 20.314f, 13f, 17f, 13f)
                curveTo(13.686f, 13f, 11f, 10.314f, 11f, 7f)
                curveTo(11f, 3.686f, 13.686f, 1f, 17f, 1f)
                curveTo(18.305f, 1f, 19.515f, 1.418f, 20.5f, 2.126f)
                verticalLineTo(1.5f)
                curveTo(20.5f, 1.324f, 20.561f, 1.162f, 20.663f, 1.034f)
                curveTo(20.8f, 0.861f, 21.012f, 0.75f, 21.25f, 0.75f)
                curveTo(21.664f, 0.75f, 22f, 1.086f, 22f, 1.5f)
                verticalLineTo(4.25f)
                close()
                moveTo(12.101f, 2f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
                curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
                verticalLineTo(13.064f)
                curveTo(19.47f, 13.659f, 18.275f, 14f, 17f, 14f)
                curveTo(13.829f, 14f, 11.15f, 11.892f, 10.29f, 9f)
                curveTo(10.283f, 8.977f, 10.276f, 8.955f, 10.27f, 8.932f)
                curveTo(10.183f, 8.629f, 10.116f, 8.318f, 10.071f, 8f)
                curveTo(10.024f, 7.673f, 10f, 7.34f, 10f, 7f)
                curveTo(10f, 6.305f, 10.101f, 5.634f, 10.29f, 5f)
                curveTo(10.393f, 4.655f, 10.521f, 4.321f, 10.674f, 4f)
                curveTo(11.03f, 3.25f, 11.515f, 2.574f, 12.101f, 2f)
                close()
            }
        }.build()

        return _BookArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _BookArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun BookArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookArrowClockwise, contentDescription = null)
    }
}
