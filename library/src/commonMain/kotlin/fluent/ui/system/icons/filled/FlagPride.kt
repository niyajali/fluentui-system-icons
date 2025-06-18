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

public val FluentUi.Filled.FlagPride: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagPride",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFE62C46))) {
            moveTo(4f, 4f)
            horizontalLineTo(20f)
            verticalLineTo(6.5f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF36D38))) {
            moveTo(4f, 6f)
            horizontalLineTo(20f)
            verticalLineTo(8.5f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD23E))) {
            moveTo(4f, 8f)
            horizontalLineTo(20f)
            verticalLineTo(10.5f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            close()
        }
        path(fill = SolidColor(Color(0xFF61BC51))) {
            moveTo(4f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(12.5f)
            horizontalLineTo(4f)
            verticalLineTo(10f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1793E8))) {
            moveTo(4f, 12f)
            horizontalLineTo(20f)
            verticalLineTo(14f)
            horizontalLineTo(4f)
            verticalLineTo(12f)
            close()
        }
        path(fill = SolidColor(Color(0xFFB73FBB))) {
            moveTo(4f, 13.5f)
            horizontalLineTo(20f)
            verticalLineTo(15.25f)
            horizontalLineTo(4f)
            verticalLineTo(13.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineTo(21.25f)
            curveTo(3f, 21.664f, 3.336f, 22f, 3.75f, 22f)
            curveTo(4.164f, 22f, 4.5f, 21.664f, 4.5f, 21.25f)
            lineTo(4.5f, 16.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 16.5f, 21f, 16.164f, 21f, 15.75f)
            verticalLineTo(3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            horizontalLineTo(3.75f)
            close()
            moveTo(4.5f, 4.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(15f)
            horizontalLineTo(4.5f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagPridePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FlagPride, contentDescription = null)
    }
}
