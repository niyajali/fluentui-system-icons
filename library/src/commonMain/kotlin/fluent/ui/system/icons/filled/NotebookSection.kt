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

public val FluentIcons.Filled.NotebookSection: ImageVector
    get() {
        if (_NotebookSection != null) {
            return _NotebookSection!!
        }
        _NotebookSection = ImageVector.Builder(
            name = "Filled.NotebookSection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.648f, 2.007f)
                lineTo(15.75f, 2f)
                curveTo(16.13f, 2f, 16.444f, 2.282f, 16.493f, 2.648f)
                lineTo(16.5f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(16.5f, 21.664f, 16.164f, 22f, 15.75f, 22f)
                curveTo(15.37f, 22f, 15.057f, 21.718f, 15.007f, 21.352f)
                lineTo(15f, 21.25f)
                verticalLineTo(19.996f)
                lineTo(9.25f, 19.996f)
                curveTo(8.007f, 19.996f, 7f, 18.989f, 7f, 17.746f)
                verticalLineTo(6.25f)
                curveTo(7f, 5.007f, 8.007f, 4f, 9.25f, 4f)
                lineTo(15f, 3.999f)
                verticalLineTo(2.75f)
                curveTo(15f, 2.37f, 15.282f, 2.057f, 15.648f, 2.007f)
                lineTo(15.75f, 2f)
                lineTo(15.648f, 2.007f)
                close()
            }
        }.build()

        return _NotebookSection!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookSection: ImageVector? = null

@Preview
@Composable
private fun NotebookSectionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.NotebookSection, contentDescription = null)
    }
}
