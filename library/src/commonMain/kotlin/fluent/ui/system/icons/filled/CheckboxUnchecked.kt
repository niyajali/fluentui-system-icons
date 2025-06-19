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

public val FluentIcons.Filled.CheckboxUnchecked: ImageVector
    get() {
        if (_CheckboxUnchecked != null) {
            return _CheckboxUnchecked!!
        }
        _CheckboxUnchecked = ImageVector.Builder(
            name = "Filled.CheckboxUnchecked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 5f)
                curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(5f, 18.44f, 5.56f, 19f, 6.25f, 19f)
                horizontalLineTo(17.75f)
                curveTo(18.44f, 19f, 19f, 18.44f, 19f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19f, 5.56f, 18.44f, 5f, 17.75f, 5f)
                horizontalLineTo(6.25f)
                close()
            }
        }.build()

        return _CheckboxUnchecked!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxUnchecked: ImageVector? = null

@Preview
@Composable
private fun CheckboxUncheckedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CheckboxUnchecked, contentDescription = null)
    }
}
