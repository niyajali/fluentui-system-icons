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

public val FluentIcons.Filled.CheckboxIndeterminate: ImageVector
    get() {
        if (_CheckboxIndeterminate != null) {
            return _CheckboxIndeterminate!!
        }
        _CheckboxIndeterminate = ImageVector.Builder(
            name = "Filled.CheckboxIndeterminate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(5f, 6.25f)
                curveTo(5f, 5.56f, 5.56f, 5f, 6.25f, 5f)
                horizontalLineTo(17.75f)
                curveTo(18.44f, 5f, 19f, 5.56f, 19f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19f, 18.44f, 18.44f, 19f, 17.75f, 19f)
                horizontalLineTo(6.25f)
                curveTo(5.56f, 19f, 5f, 18.44f, 5f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(7.5f, 6.5f)
                curveTo(6.948f, 6.5f, 6.5f, 6.948f, 6.5f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(6.5f, 17.052f, 6.948f, 17.5f, 7.5f, 17.5f)
                horizontalLineTo(16.5f)
                curveTo(17.052f, 17.5f, 17.5f, 17.052f, 17.5f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(17.5f, 6.948f, 17.052f, 6.5f, 16.5f, 6.5f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return _CheckboxIndeterminate!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxIndeterminate: ImageVector? = null

@Preview
@Composable
private fun CheckboxIndeterminatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CheckboxIndeterminate, contentDescription = null)
    }
}
