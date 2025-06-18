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

public val FluentUi.Filled.ToggleMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ToggleMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            horizontalLineTo(17.5f)
            curveTo(19.985f, 2f, 22f, 4.015f, 22f, 6.5f)
            curveTo(22f, 8.985f, 19.985f, 11f, 17.5f, 11f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 11f, 2f, 8.985f, 2f, 6.5f)
            close()
            moveTo(6.5f, 8.5f)
            curveTo(7.605f, 8.5f, 8.5f, 7.605f, 8.5f, 6.5f)
            curveTo(8.5f, 5.395f, 7.605f, 4.5f, 6.5f, 4.5f)
            curveTo(5.395f, 4.5f, 4.5f, 5.395f, 4.5f, 6.5f)
            curveTo(4.5f, 7.605f, 5.395f, 8.5f, 6.5f, 8.5f)
            close()
            moveTo(6.5f, 13f)
            curveTo(4.015f, 13f, 2f, 15.015f, 2f, 17.5f)
            curveTo(2f, 19.985f, 4.015f, 22f, 6.5f, 22f)
            horizontalLineTo(17.5f)
            curveTo(19.985f, 22f, 22f, 19.985f, 22f, 17.5f)
            curveTo(22f, 15.015f, 19.985f, 13f, 17.5f, 13f)
            horizontalLineTo(6.5f)
            close()
            moveTo(19.5f, 17.5f)
            curveTo(19.5f, 18.605f, 18.605f, 19.5f, 17.5f, 19.5f)
            curveTo(16.395f, 19.5f, 15.5f, 18.605f, 15.5f, 17.5f)
            curveTo(15.5f, 16.395f, 16.395f, 15.5f, 17.5f, 15.5f)
            curveTo(18.605f, 15.5f, 19.5f, 16.395f, 19.5f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ToggleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ToggleMultiple, contentDescription = null)
    }
}
