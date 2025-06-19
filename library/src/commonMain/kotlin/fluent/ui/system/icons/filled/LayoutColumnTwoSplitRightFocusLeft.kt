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

public val FluentIcons.Filled.LayoutColumnTwoSplitRightFocusLeft: ImageVector
    get() {
        if (_LayoutColumnTwoSplitRightFocusLeft != null) {
            return _LayoutColumnTwoSplitRightFocusLeft!!
        }
        _LayoutColumnTwoSplitRightFocusLeft = ImageVector.Builder(
            name = "Filled.LayoutColumnTwoSplitRightFocusLeft",
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
                moveTo(12f, 4.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 12.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _LayoutColumnTwoSplitRightFocusLeft!!
    }

@Suppress("ObjectPropertyName")
private var _LayoutColumnTwoSplitRightFocusLeft: ImageVector? = null

@Preview
@Composable
private fun LayoutColumnTwoSplitRightFocusLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LayoutColumnTwoSplitRightFocusLeft, contentDescription = null)
    }
}
