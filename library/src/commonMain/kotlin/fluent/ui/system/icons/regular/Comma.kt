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

public val FluentIcons.Regular.Comma: ImageVector
    get() {
        if (_Comma != null) {
            return _Comma!!
        }
        _Comma = ImageVector.Builder(
            name = "Regular.Comma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.62f, 12.023f)
                curveTo(13.918f, 12.632f, 13.002f, 13f, 12f, 13f)
                curveTo(9.791f, 13f, 8f, 11.209f, 8f, 9f)
                curveTo(8f, 6.791f, 9.791f, 5f, 12f, 5f)
                curveTo(14.053f, 5f, 15.745f, 6.547f, 15.974f, 8.539f)
                curveTo(16.33f, 10.35f, 16.326f, 12.506f, 15.51f, 14.439f)
                curveTo(14.648f, 16.48f, 12.909f, 18.198f, 9.94f, 18.976f)
                curveTo(9.539f, 19.08f, 9.129f, 18.841f, 9.024f, 18.44f)
                curveTo(8.92f, 18.039f, 9.159f, 17.629f, 9.56f, 17.524f)
                curveTo(12.091f, 16.862f, 13.452f, 15.455f, 14.128f, 13.856f)
                curveTo(14.375f, 13.272f, 14.533f, 12.653f, 14.62f, 12.023f)
                close()
            }
        }.build()

        return _Comma!!
    }

@Suppress("ObjectPropertyName")
private var _Comma: ImageVector? = null

@Preview
@Composable
private fun CommaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Comma, contentDescription = null)
    }
}
