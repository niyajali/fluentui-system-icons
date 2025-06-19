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

public val FluentIcons.Filled.CheckmarkSquare: ImageVector
    get() {
        if (_CheckmarkSquare != null) {
            return _CheckmarkSquare!!
        }
        _CheckmarkSquare = ImageVector.Builder(
            name = "Filled.CheckmarkSquare",
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
                moveTo(16.28f, 9.78f)
                lineTo(11.28f, 14.78f)
                curveTo(10.987f, 15.073f, 10.512f, 15.073f, 10.22f, 14.78f)
                lineTo(8.216f, 12.776f)
                curveTo(7.923f, 12.483f, 7.923f, 12.009f, 8.216f, 11.716f)
                curveTo(8.509f, 11.423f, 8.984f, 11.423f, 9.276f, 11.716f)
                lineTo(10.75f, 13.189f)
                lineTo(15.22f, 8.72f)
                curveTo(15.512f, 8.427f, 15.987f, 8.427f, 16.28f, 8.72f)
                curveTo(16.573f, 9.013f, 16.573f, 9.487f, 16.28f, 9.78f)
                close()
            }
        }.build()

        return _CheckmarkSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkSquare: ImageVector? = null

@Preview
@Composable
private fun CheckmarkSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CheckmarkSquare, contentDescription = null)
    }
}
