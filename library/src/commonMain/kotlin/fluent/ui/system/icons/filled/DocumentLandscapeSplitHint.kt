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

public val FluentIcons.Filled.DocumentLandscapeSplitHint: ImageVector
    get() {
        if (_DocumentLandscapeSplitHint != null) {
            return _DocumentLandscapeSplitHint!!
        }
        _DocumentLandscapeSplitHint = ImageVector.Builder(
            name = "Filled.DocumentLandscapeSplitHint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.75f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                curveTo(14f, 11.105f, 14.895f, 12f, 16f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                curveTo(22f, 19.105f, 21.105f, 20f, 20f, 20f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 20f, 12f, 19.664f, 12f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(12f, 4.336f, 12.336f, 4f, 12.75f, 4f)
                close()
                moveTo(21.487f, 10.427f)
                curveTo(21.511f, 10.451f, 21.534f, 10.475f, 21.557f, 10.5f)
                horizontalLineTo(16f)
                curveTo(15.724f, 10.5f, 15.5f, 10.276f, 15.5f, 10f)
                verticalLineTo(4.443f)
                curveTo(15.525f, 4.466f, 15.549f, 4.489f, 15.573f, 4.513f)
                lineTo(21.487f, 10.427f)
                close()
                moveTo(3.5f, 10.25f)
                curveTo(3.5f, 9.836f, 3.164f, 9.5f, 2.75f, 9.5f)
                curveTo(2.336f, 9.5f, 2f, 9.836f, 2f, 10.25f)
                verticalLineTo(13.75f)
                curveTo(2f, 14.164f, 2.336f, 14.5f, 2.75f, 14.5f)
                curveTo(3.164f, 14.5f, 3.5f, 14.164f, 3.5f, 13.75f)
                verticalLineTo(10.25f)
                close()
                moveTo(7f, 4.75f)
                curveTo(7f, 4.336f, 7.336f, 4f, 7.75f, 4f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 4f, 10.5f, 4.336f, 10.5f, 4.75f)
                curveTo(10.5f, 5.164f, 10.164f, 5.5f, 9.75f, 5.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 5.5f, 7f, 5.164f, 7f, 4.75f)
                close()
                moveTo(7.75f, 18.5f)
                curveTo(7.336f, 18.5f, 7f, 18.836f, 7f, 19.25f)
                curveTo(7f, 19.664f, 7.336f, 20f, 7.75f, 20f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 20f, 10.5f, 19.664f, 10.5f, 19.25f)
                curveTo(10.5f, 18.836f, 10.164f, 18.5f, 9.75f, 18.5f)
                horizontalLineTo(7.75f)
                close()
                moveTo(2f, 6f)
                curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
                horizontalLineTo(4.75f)
                curveTo(5.164f, 4f, 5.5f, 4.336f, 5.5f, 4.75f)
                curveTo(5.5f, 5.164f, 5.164f, 5.5f, 4.75f, 5.5f)
                horizontalLineTo(4f)
                curveTo(3.724f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
                verticalLineTo(7.25f)
                curveTo(3.5f, 7.664f, 3.164f, 8f, 2.75f, 8f)
                curveTo(2.336f, 8f, 2f, 7.664f, 2f, 7.25f)
                verticalLineTo(6f)
                close()
                moveTo(4f, 20f)
                curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
                verticalLineTo(16.75f)
                curveTo(2f, 16.336f, 2.336f, 16f, 2.75f, 16f)
                curveTo(3.164f, 16f, 3.5f, 16.336f, 3.5f, 16.75f)
                verticalLineTo(18f)
                curveTo(3.5f, 18.276f, 3.724f, 18.5f, 4f, 18.5f)
                horizontalLineTo(4.75f)
                curveTo(5.164f, 18.5f, 5.5f, 18.836f, 5.5f, 19.25f)
                curveTo(5.5f, 19.664f, 5.164f, 20f, 4.75f, 20f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _DocumentLandscapeSplitHint!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLandscapeSplitHint: ImageVector? = null

@Preview
@Composable
private fun DocumentLandscapeSplitHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentLandscapeSplitHint, contentDescription = null)
    }
}
