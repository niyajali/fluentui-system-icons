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

public val FluentIcons.Filled.NavigationBriefcase: ImageVector
    get() {
        if (_NavigationBriefcase != null) {
            return _NavigationBriefcase!!
        }
        _NavigationBriefcase = ImageVector.Builder(
            name = "Filled.NavigationBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                curveTo(2.448f, 19f, 2f, 18.552f, 2f, 18f)
                curveTo(2f, 17.487f, 2.386f, 17.065f, 2.883f, 17.007f)
                lineTo(3f, 17f)
                close()
                moveTo(16.75f, 11f)
                horizontalLineTo(17.094f)
                verticalLineTo(10.998f)
                lineTo(3f, 11f)
                lineTo(2.883f, 11.007f)
                curveTo(2.386f, 11.065f, 2f, 11.487f, 2f, 12f)
                curveTo(2f, 12.552f, 2.448f, 13f, 3f, 13f)
                lineTo(14.104f, 12.999f)
                curveTo(14.431f, 11.845f, 15.492f, 11f, 16.75f, 11f)
                close()
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                lineTo(2.883f, 5.007f)
                curveTo(2.386f, 5.064f, 2f, 5.487f, 2f, 6f)
                curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
                horizontalLineTo(21f)
                lineTo(21.117f, 6.993f)
                curveTo(21.614f, 6.936f, 22f, 6.513f, 22f, 6f)
                curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
                close()
                moveTo(15f, 15f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 15f, 13f, 15.672f, 13f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(13f, 22.328f, 13.672f, 23f, 14.5f, 23f)
                horizontalLineTo(22.5f)
                curveTo(23.328f, 23f, 24f, 22.328f, 24f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(24f, 15.672f, 23.328f, 15f, 22.5f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(13.75f)
                curveTo(22f, 12.783f, 21.216f, 12f, 20.25f, 12f)
                horizontalLineTo(16.75f)
                curveTo(15.783f, 12f, 15f, 12.783f, 15f, 13.75f)
                verticalLineTo(15f)
                close()
                moveTo(16.5f, 13.75f)
                curveTo(16.5f, 13.612f, 16.612f, 13.5f, 16.75f, 13.5f)
                horizontalLineTo(20.25f)
                curveTo(20.388f, 13.5f, 20.5f, 13.612f, 20.5f, 13.75f)
                verticalLineTo(15f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.75f)
                close()
            }
        }.build()

        return _NavigationBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationBriefcase: ImageVector? = null

@Preview
@Composable
private fun NavigationBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NavigationBriefcase, contentDescription = null)
    }
}
