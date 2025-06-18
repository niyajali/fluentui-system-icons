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

public val FluentUi.Filled.TableBottomRow: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(14.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(14.5f)
            horizontalLineTo(21f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 20.489f)
            curveTo(3.8f, 20.041f, 3.284f, 19.332f, 3.087f, 18.5f)
            curveTo(3.03f, 18.259f, 3f, 18.008f, 3f, 17.75f)
            verticalLineTo(16f)
            horizontalLineTo(8f)
            lineTo(8f, 21f)
            horizontalLineTo(6.25f)
            curveTo(5.606f, 21f, 5.005f, 20.813f, 4.5f, 20.489f)
            close()
            moveTo(20.913f, 18.5f)
            curveTo(20.97f, 18.259f, 21f, 18.008f, 21f, 17.75f)
            verticalLineTo(16f)
            horizontalLineTo(16f)
            verticalLineTo(21f)
            horizontalLineTo(17.75f)
            curveTo(18.394f, 21f, 18.995f, 20.813f, 19.5f, 20.489f)
            curveTo(20.2f, 20.041f, 20.716f, 19.332f, 20.913f, 18.5f)
            close()
            moveTo(14.5f, 21f)
            verticalLineTo(16f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 21f)
            horizontalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableBottomRowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableBottomRow, contentDescription = null)
    }
}
