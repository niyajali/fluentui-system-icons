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

public val FluentIcons.Filled.OrganizationHorizontal: ImageVector
    get() {
        if (_OrganizationHorizontal != null) {
            return _OrganizationHorizontal!!
        }
        _OrganizationHorizontal = ImageVector.Builder(
            name = "Filled.OrganizationHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.748f, 16.002f)
                curveTo(3.676f, 16.002f, 1.996f, 14.323f, 1.996f, 12.25f)
                curveTo(1.996f, 10.178f, 3.676f, 8.498f, 5.748f, 8.498f)
                curveTo(7.564f, 8.498f, 9.078f, 9.787f, 9.426f, 11.5f)
                horizontalLineTo(11.498f)
                verticalLineTo(8.25f)
                curveTo(11.498f, 7.007f, 12.506f, 6f, 13.748f, 6f)
                horizontalLineTo(14.573f)
                curveTo(14.92f, 4.286f, 16.434f, 2.995f, 18.251f, 2.995f)
                curveTo(20.323f, 2.995f, 22.003f, 4.675f, 22.003f, 6.748f)
                curveTo(22.003f, 8.82f, 20.323f, 10.5f, 18.251f, 10.5f)
                curveTo(16.436f, 10.5f, 14.922f, 9.212f, 14.574f, 7.5f)
                horizontalLineTo(13.748f)
                curveTo(13.334f, 7.5f, 12.998f, 7.836f, 12.998f, 8.25f)
                verticalLineTo(16.25f)
                curveTo(12.998f, 16.664f, 13.334f, 17f, 13.748f, 17f)
                horizontalLineTo(14.573f)
                curveTo(14.92f, 15.286f, 16.434f, 13.995f, 18.251f, 13.995f)
                curveTo(20.323f, 13.995f, 22.003f, 15.675f, 22.003f, 17.748f)
                curveTo(22.003f, 19.82f, 20.323f, 21.5f, 18.251f, 21.5f)
                curveTo(16.436f, 21.5f, 14.922f, 20.212f, 14.574f, 18.5f)
                horizontalLineTo(13.748f)
                curveTo(12.506f, 18.5f, 11.498f, 17.493f, 11.498f, 16.25f)
                verticalLineTo(13f)
                horizontalLineTo(9.426f)
                curveTo(9.078f, 14.713f, 7.564f, 16.002f, 5.748f, 16.002f)
                close()
            }
        }.build()

        return _OrganizationHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _OrganizationHorizontal: ImageVector? = null

@Preview
@Composable
private fun OrganizationHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.OrganizationHorizontal, contentDescription = null)
    }
}
