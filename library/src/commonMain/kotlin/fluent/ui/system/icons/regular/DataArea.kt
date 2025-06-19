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

public val FluentIcons.Regular.DataArea: ImageVector
    get() {
        if (_DataArea != null) {
            return _DataArea!!
        }
        _DataArea = ImageVector.Builder(
            name = "Regular.DataArea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3f)
                curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
                verticalLineTo(10.008f)
                lineTo(8.151f, 8.086f)
                curveTo(8.38f, 7.965f, 8.656f, 7.972f, 8.88f, 8.104f)
                lineTo(12.7f, 10.35f)
                lineTo(18.3f, 6.15f)
                curveTo(18.527f, 5.98f, 18.831f, 5.952f, 19.085f, 6.079f)
                curveTo(19.34f, 6.206f, 19.5f, 6.466f, 19.5f, 6.75f)
                verticalLineTo(19.5f)
                lineTo(20.25f, 19.5f)
                curveTo(20.664f, 19.5f, 21f, 19.836f, 21f, 20.25f)
                curveTo(21f, 20.664f, 20.664f, 21f, 20.25f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                close()
                moveTo(18f, 19.5f)
                verticalLineTo(8.25f)
                lineTo(13.2f, 11.85f)
                curveTo(12.958f, 12.031f, 12.631f, 12.05f, 12.37f, 11.896f)
                lineTo(8.48f, 9.608f)
                lineTo(4.5f, 11.703f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                lineTo(18f, 19.5f)
                close()
            }
        }.build()

        return _DataArea!!
    }

@Suppress("ObjectPropertyName")
private var _DataArea: ImageVector? = null

@Preview
@Composable
private fun DataAreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataArea, contentDescription = null)
    }
}
