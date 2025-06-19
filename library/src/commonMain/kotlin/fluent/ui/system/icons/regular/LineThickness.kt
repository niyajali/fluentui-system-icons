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

public val FluentIcons.Regular.LineThickness: ImageVector
    get() {
        if (_LineThickness != null) {
            return _LineThickness!!
        }
        _LineThickness = ImageVector.Builder(
            name = "Regular.LineThickness",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 3.5f)
                curveTo(2.336f, 3.5f, 2f, 3.836f, 2f, 4.25f)
                curveTo(2f, 4.664f, 2.336f, 5f, 2.75f, 5f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 5f, 22f, 4.664f, 22f, 4.25f)
                curveTo(22f, 3.836f, 21.664f, 3.5f, 21.25f, 3.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2f, 10.75f)
                curveTo(2f, 10.06f, 2.56f, 9.5f, 3.25f, 9.5f)
                horizontalLineTo(20.75f)
                curveTo(21.44f, 9.5f, 22f, 10.06f, 22f, 10.75f)
                curveTo(22f, 11.44f, 21.44f, 12f, 20.75f, 12f)
                horizontalLineTo(3.25f)
                curveTo(2.56f, 12f, 2f, 11.44f, 2f, 10.75f)
                close()
                moveTo(2f, 18.25f)
                curveTo(2f, 17.284f, 2.783f, 16.5f, 3.75f, 16.5f)
                horizontalLineTo(20.25f)
                curveTo(21.216f, 16.5f, 22f, 17.284f, 22f, 18.25f)
                curveTo(22f, 19.216f, 21.216f, 20f, 20.25f, 20f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 20f, 2f, 19.216f, 2f, 18.25f)
                close()
            }
        }.build()

        return _LineThickness!!
    }

@Suppress("ObjectPropertyName")
private var _LineThickness: ImageVector? = null

@Preview
@Composable
private fun LineThicknessPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LineThickness, contentDescription = null)
    }
}
