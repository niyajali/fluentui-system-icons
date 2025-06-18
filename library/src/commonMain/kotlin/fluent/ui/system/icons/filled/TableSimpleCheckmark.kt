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

public val FluentUi.Filled.TableSimpleCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.25f, 12.75f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(12.75f)
            horizontalLineTo(11.25f)
            close()
            moveTo(12.75f, 21f)
            verticalLineTo(12.75f)
            horizontalLineTo(21f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(12.75f)
            close()
            moveTo(12.75f, 3f)
            verticalLineTo(11.25f)
            horizontalLineTo(21f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(12.75f)
            close()
            moveTo(11.25f, 3f)
            verticalLineTo(11.25f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(11.25f)
            close()
            moveTo(18.783f, 16.28f)
            curveTo(19.076f, 15.987f, 19.076f, 15.513f, 18.783f, 15.22f)
            curveTo(18.49f, 14.927f, 18.015f, 14.927f, 17.723f, 15.22f)
            lineTo(16.25f, 16.692f)
            lineTo(15.78f, 16.223f)
            curveTo(15.487f, 15.93f, 15.013f, 15.93f, 14.72f, 16.223f)
            curveTo(14.427f, 16.515f, 14.427f, 16.99f, 14.72f, 17.283f)
            lineTo(15.72f, 18.283f)
            curveTo(16.013f, 18.576f, 16.487f, 18.576f, 16.78f, 18.283f)
            lineTo(18.783f, 16.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableSimpleCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableSimpleCheckmark, contentDescription = null)
    }
}
