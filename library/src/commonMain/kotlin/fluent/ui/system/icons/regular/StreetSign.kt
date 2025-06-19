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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.StreetSign: ImageVector
    get() {
        if (_StreetSign != null) {
            return _StreetSign!!
        }
        _StreetSign = ImageVector.Builder(
            name = "Regular.StreetSign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 4.5f)
                curveTo(8f, 3.119f, 9.119f, 2f, 10.5f, 2f)
                curveTo(11.881f, 2f, 13f, 3.119f, 13f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(16.379f)
                curveTo(16.975f, 6f, 17.548f, 6.237f, 17.97f, 6.659f)
                lineTo(20.78f, 9.47f)
                curveTo(21.073f, 9.763f, 21.073f, 10.237f, 20.78f, 10.53f)
                lineTo(17.97f, 13.341f)
                curveTo(17.548f, 13.763f, 16.975f, 14f, 16.379f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(20.75f)
                curveTo(13f, 21.44f, 12.44f, 22f, 11.75f, 22f)
                horizontalLineTo(9.25f)
                curveTo(8.56f, 22f, 8f, 21.44f, 8f, 20.75f)
                verticalLineTo(14f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 14f, 3f, 12.993f, 3f, 11.75f)
                verticalLineTo(8.25f)
                curveTo(3f, 7.007f, 4.007f, 6f, 5.25f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                close()
                moveTo(9.5f, 6f)
                horizontalLineTo(11.5f)
                verticalLineTo(4.5f)
                curveTo(11.5f, 3.948f, 11.052f, 3.5f, 10.5f, 3.5f)
                curveTo(9.948f, 3.5f, 9.5f, 3.948f, 9.5f, 4.5f)
                verticalLineTo(6f)
                close()
                moveTo(9.5f, 14f)
                verticalLineTo(20.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(14f)
                horizontalLineTo(9.5f)
                close()
                moveTo(4.5f, 8.25f)
                verticalLineTo(11.75f)
                curveTo(4.5f, 12.164f, 4.836f, 12.5f, 5.25f, 12.5f)
                horizontalLineTo(16.379f)
                curveTo(16.578f, 12.5f, 16.768f, 12.421f, 16.909f, 12.28f)
                lineTo(19.189f, 10f)
                lineTo(16.909f, 7.72f)
                curveTo(16.768f, 7.579f, 16.578f, 7.5f, 16.379f, 7.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 7.5f, 4.5f, 7.836f, 4.5f, 8.25f)
                close()
            }
        }.build()

        return _StreetSign!!
    }

@Suppress("ObjectPropertyName")
private var _StreetSign: ImageVector? = null

@Preview
@Composable
private fun StreetSignPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StreetSign, contentDescription = null)
    }
}
