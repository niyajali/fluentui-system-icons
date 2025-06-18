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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.CircleMultipleConcentric: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleMultipleConcentric",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            close()
            moveTo(7.5f, 12f)
            curveTo(7.5f, 9.515f, 9.515f, 7.5f, 12f, 7.5f)
            curveTo(14.485f, 7.5f, 16.5f, 9.515f, 16.5f, 12f)
            curveTo(16.5f, 14.485f, 14.485f, 16.5f, 12f, 16.5f)
            curveTo(9.515f, 16.5f, 7.5f, 14.485f, 7.5f, 12f)
            close()
            moveTo(12f, 6f)
            curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
            curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
            curveTo(15.314f, 18f, 18f, 15.314f, 18f, 12f)
            curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleMultipleConcentricPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CircleMultipleConcentric, contentDescription = null)
    }
}
