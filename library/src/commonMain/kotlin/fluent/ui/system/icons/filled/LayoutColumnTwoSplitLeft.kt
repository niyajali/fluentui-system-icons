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

public val FluentIcons.Filled.LayoutColumnTwoSplitLeft: ImageVector
    get() {
        if (_LayoutColumnTwoSplitLeft != null) {
            return _LayoutColumnTwoSplitLeft!!
        }
        _LayoutColumnTwoSplitLeft = ImageVector.Builder(
            name = "Filled.LayoutColumnTwoSplitLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 21f)
                horizontalLineTo(12.75f)
                verticalLineTo(3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                close()
                moveTo(6.25f, 3f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                close()
                moveTo(3f, 12.75f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _LayoutColumnTwoSplitLeft!!
    }

@Suppress("ObjectPropertyName")
private var _LayoutColumnTwoSplitLeft: ImageVector? = null

@Preview
@Composable
private fun LayoutColumnTwoSplitLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LayoutColumnTwoSplitLeft, contentDescription = null)
    }
}
