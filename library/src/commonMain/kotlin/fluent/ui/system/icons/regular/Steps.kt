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

public val FluentUi.Regular.Steps: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Steps",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3.375f)
            curveTo(12f, 2.616f, 12.616f, 2f, 13.375f, 2f)
            horizontalLineTo(17.125f)
            curveTo(17.884f, 2f, 18.5f, 2.616f, 18.5f, 3.375f)
            verticalLineTo(9f)
            horizontalLineTo(17f)
            verticalLineTo(3.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(7.125f)
            curveTo(13.5f, 7.884f, 12.884f, 8.5f, 12.125f, 8.5f)
            horizontalLineTo(8.5f)
            verticalLineTo(12.125f)
            curveTo(8.5f, 12.884f, 7.884f, 13.5f, 7.125f, 13.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(17f)
            horizontalLineTo(9f)
            verticalLineTo(18.5f)
            horizontalLineTo(3.375f)
            curveTo(2.616f, 18.5f, 2f, 17.884f, 2f, 17.125f)
            verticalLineTo(13.375f)
            curveTo(2f, 12.616f, 2.616f, 12f, 3.375f, 12f)
            horizontalLineTo(7f)
            verticalLineTo(8.375f)
            curveTo(7f, 7.616f, 7.616f, 7f, 8.375f, 7f)
            horizontalLineTo(12f)
            verticalLineTo(3.375f)
            close()
            moveTo(16.375f, 10f)
            curveTo(15.616f, 10f, 15f, 10.616f, 15f, 11.375f)
            verticalLineTo(15f)
            horizontalLineTo(11.375f)
            curveTo(10.616f, 15f, 10f, 15.616f, 10f, 16.375f)
            verticalLineTo(20.125f)
            curveTo(10f, 20.884f, 10.616f, 21.5f, 11.375f, 21.5f)
            horizontalLineTo(18.25f)
            curveTo(20.045f, 21.5f, 21.5f, 20.045f, 21.5f, 18.25f)
            verticalLineTo(11.375f)
            curveTo(21.5f, 10.616f, 20.884f, 10f, 20.125f, 10f)
            horizontalLineTo(16.375f)
            close()
            moveTo(16.5f, 15.125f)
            verticalLineTo(11.5f)
            horizontalLineTo(20f)
            verticalLineTo(18.25f)
            curveTo(20f, 19.216f, 19.216f, 20f, 18.25f, 20f)
            horizontalLineTo(11.5f)
            verticalLineTo(16.5f)
            horizontalLineTo(15.125f)
            curveTo(15.884f, 16.5f, 16.5f, 15.884f, 16.5f, 15.125f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StepsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Steps, contentDescription = null)
    }
}
