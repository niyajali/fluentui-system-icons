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

public val FluentIcons.Filled.BranchFork: ImageVector
    get() {
        if (_BranchFork != null) {
            return _BranchFork!!
        }
        _BranchFork = ImageVector.Builder(
            name = "Filled.BranchFork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 5.5f)
                curveTo(11f, 7.263f, 9.696f, 8.722f, 8f, 8.965f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.25f)
                curveTo(15.493f, 11.5f, 16.5f, 10.493f, 16.5f, 9.25f)
                verticalLineTo(8.855f)
                curveTo(15.054f, 8.425f, 14f, 7.086f, 14f, 5.5f)
                curveTo(14f, 3.567f, 15.567f, 2f, 17.5f, 2f)
                curveTo(19.433f, 2f, 21f, 3.567f, 21f, 5.5f)
                curveTo(21f, 7.263f, 19.696f, 8.722f, 18f, 8.965f)
                verticalLineTo(9.25f)
                curveTo(18f, 11.321f, 16.321f, 13f, 14.25f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(15.035f)
                curveTo(9.696f, 15.278f, 11f, 16.737f, 11f, 18.5f)
                curveTo(11f, 20.433f, 9.433f, 22f, 7.5f, 22f)
                curveTo(5.567f, 22f, 4f, 20.433f, 4f, 18.5f)
                curveTo(4f, 16.914f, 5.054f, 15.575f, 6.5f, 15.145f)
                verticalLineTo(8.855f)
                curveTo(5.054f, 8.425f, 4f, 7.086f, 4f, 5.5f)
                curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
                curveTo(9.433f, 2f, 11f, 3.567f, 11f, 5.5f)
                close()
            }
        }.build()

        return _BranchFork!!
    }

@Suppress("ObjectPropertyName")
private var _BranchFork: ImageVector? = null

@Preview
@Composable
private fun BranchForkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BranchFork, contentDescription = null)
    }
}
