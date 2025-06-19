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

public val FluentIcons.Regular.BorderAll: ImageVector
    get() {
        if (_BorderAll != null) {
            return _BorderAll!!
        }
        _BorderAll = ImageVector.Builder(
            name = "Regular.BorderAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(12.75f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.5f)
                close()
                moveTo(11.25f, 12.75f)
                horizontalLineTo(4.5f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(12.75f, 11.25f)
                horizontalLineTo(19.5f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(11.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()

        return _BorderAll!!
    }

@Suppress("ObjectPropertyName")
private var _BorderAll: ImageVector? = null

@Preview
@Composable
private fun BorderAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BorderAll, contentDescription = null)
    }
}
