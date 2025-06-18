package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.TableCellsSplit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableCellsSplit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            horizontalLineTo(11f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            close()
            moveTo(21f, 7f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(12.5f)
            verticalLineTo(7f)
            horizontalLineTo(21f)
            close()
            moveTo(12.5f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(17f)
            horizontalLineTo(12.5f)
            verticalLineTo(21f)
            close()
            moveTo(3f, 8.5f)
            verticalLineTo(15.5f)
            horizontalLineTo(21f)
            verticalLineTo(8.5f)
            horizontalLineTo(3f)
            close()
            moveTo(12.5f, 10f)
            verticalLineTo(14f)
            horizontalLineTo(11f)
            verticalLineTo(10f)
            horizontalLineTo(12.5f)
            close()
            moveTo(3f, 17.75f)
            verticalLineTo(17f)
            horizontalLineTo(11f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableCellsSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableCellsSplit, contentDescription = null)
    }
}
