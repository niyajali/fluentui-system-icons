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

public val FluentIcons.Filled.ImageAltText: ImageVector
    get() {
        if (_ImageAltText != null) {
            return _ImageAltText!!
        }
        _ImageAltText = ImageVector.Builder(
            name = "Filled.ImageAltText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(1f, 3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(10f)
                curveTo(11.105f, 1f, 12f, 1.895f, 12f, 3f)
                verticalLineTo(9f)
                curveTo(12f, 10.105f, 11.105f, 11f, 10f, 11f)
                horizontalLineTo(3f)
                curveTo(1.895f, 11f, 1f, 10.105f, 1f, 9f)
                verticalLineTo(3f)
                close()
                moveTo(3.5f, 4f)
                curveTo(3.224f, 4f, 3f, 4.224f, 3f, 4.5f)
                curveTo(3f, 4.776f, 3.224f, 5f, 3.5f, 5f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 5f, 10f, 4.776f, 10f, 4.5f)
                curveTo(10f, 4.224f, 9.776f, 4f, 9.5f, 4f)
                horizontalLineTo(3.5f)
                close()
                moveTo(3.5f, 7f)
                curveTo(3.224f, 7f, 3f, 7.224f, 3f, 7.5f)
                curveTo(3f, 7.776f, 3.224f, 8f, 3.5f, 8f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 8f, 10f, 7.776f, 10f, 7.5f)
                curveTo(10f, 7.224f, 9.776f, 7f, 9.5f, 7f)
                horizontalLineTo(3.5f)
                close()
                moveTo(16.752f, 8.5f)
                curveTo(17.167f, 8.5f, 17.504f, 8.837f, 17.504f, 9.252f)
                curveTo(17.504f, 9.667f, 17.167f, 10.004f, 16.752f, 10.004f)
                curveTo(16.337f, 10.004f, 16f, 9.667f, 16f, 9.252f)
                curveTo(16f, 8.837f, 16.337f, 8.5f, 16.752f, 8.5f)
                close()
                moveTo(13f, 9f)
                curveTo(13f, 10.657f, 11.657f, 12f, 10f, 12f)
                lineTo(4f, 12f)
                verticalLineTo(18.75f)
                curveTo(4f, 19.377f, 4.178f, 19.963f, 4.485f, 20.459f)
                lineTo(11.424f, 13.648f)
                lineTo(11.559f, 13.525f)
                curveTo(12.394f, 12.827f, 13.615f, 12.829f, 14.448f, 13.531f)
                lineTo(14.576f, 13.648f)
                lineTo(21.515f, 20.459f)
                curveTo(21.822f, 19.963f, 22f, 19.377f, 22f, 18.75f)
                verticalLineTo(7.25f)
                curveTo(22f, 5.455f, 20.545f, 4f, 18.75f, 4f)
                horizontalLineTo(13f)
                lineTo(13f, 9f)
                close()
                moveTo(16.752f, 7f)
                curveTo(17.996f, 7f, 19.004f, 8.008f, 19.004f, 9.252f)
                curveTo(19.004f, 10.496f, 17.996f, 11.504f, 16.752f, 11.504f)
                curveTo(15.508f, 11.504f, 14.5f, 10.496f, 14.5f, 9.252f)
                curveTo(14.5f, 8.008f, 15.508f, 7f, 16.752f, 7f)
                close()
                moveTo(12.475f, 14.718f)
                lineTo(12.558f, 14.647f)
                curveTo(12.817f, 14.458f, 13.17f, 14.455f, 13.432f, 14.64f)
                lineTo(13.525f, 14.718f)
                lineTo(20.453f, 21.519f)
                curveTo(19.958f, 21.824f, 19.375f, 22f, 18.75f, 22f)
                horizontalLineTo(7.25f)
                curveTo(6.626f, 22f, 6.042f, 21.824f, 5.547f, 21.519f)
                lineTo(12.475f, 14.718f)
                close()
            }
        }.build()

        return _ImageAltText!!
    }

@Suppress("ObjectPropertyName")
private var _ImageAltText: ImageVector? = null

@Preview
@Composable
private fun ImageAltTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageAltText, contentDescription = null)
    }
}
