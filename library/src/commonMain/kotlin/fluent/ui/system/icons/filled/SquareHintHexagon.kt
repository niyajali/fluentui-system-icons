/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Filled.SquareHintHexagon: ImageVector
    get() {
        if (_SquareHintHexagon != null) {
            return _SquareHintHexagon!!
        }
        _SquareHintHexagon = ImageVector.Builder(
            name = "Filled.SquareHintHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.75f, 3f)
                curveTo(10.336f, 3f, 10f, 3.336f, 10f, 3.75f)
                curveTo(10f, 4.164f, 10.336f, 4.5f, 10.75f, 4.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 4.5f, 14f, 4.164f, 14f, 3.75f)
                curveTo(14f, 3.336f, 13.664f, 3f, 13.25f, 3f)
                horizontalLineTo(10.75f)
                close()
                moveTo(17f, 3.75f)
                curveTo(17f, 4.164f, 17.336f, 4.5f, 17.75f, 4.5f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                curveTo(19.5f, 6.664f, 19.836f, 7f, 20.25f, 7f)
                curveTo(20.664f, 7f, 21f, 6.664f, 21f, 6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                curveTo(17.336f, 3f, 17f, 3.336f, 17f, 3.75f)
                close()
                moveTo(7f, 3.75f)
                curveTo(7f, 3.336f, 6.664f, 3f, 6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                curveTo(3f, 6.664f, 3.336f, 7f, 3.75f, 7f)
                curveTo(4.164f, 7f, 4.5f, 6.664f, 4.5f, 6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                curveTo(6.664f, 4.5f, 7f, 4.164f, 7f, 3.75f)
                close()
                moveTo(3f, 17.75f)
                curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
                curveTo(4.164f, 17f, 4.5f, 17.336f, 4.5f, 17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                curveTo(6.664f, 19.5f, 7f, 19.836f, 7f, 20.25f)
                curveTo(7f, 20.664f, 6.664f, 21f, 6.25f, 21f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                close()
                moveTo(10f, 20.25f)
                curveTo(10f, 19.836f, 10.336f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 19.5f, 14f, 19.836f, 14f, 20.25f)
                curveTo(14f, 20.664f, 13.664f, 21f, 13.25f, 21f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 21f, 10f, 20.664f, 10f, 20.25f)
                close()
                moveTo(17f, 20.25f)
                curveTo(17f, 19.836f, 17.336f, 19.5f, 17.75f, 19.5f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                curveTo(19.5f, 17.336f, 19.836f, 17f, 20.25f, 17f)
                curveTo(20.664f, 17f, 21f, 17.336f, 21f, 17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                curveTo(17.336f, 21f, 17f, 20.664f, 17f, 20.25f)
                close()
                moveTo(21f, 10.75f)
                curveTo(21f, 10.336f, 20.664f, 10f, 20.25f, 10f)
                curveTo(19.836f, 10f, 19.5f, 10.336f, 19.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(19.5f, 13.664f, 19.836f, 14f, 20.25f, 14f)
                curveTo(20.664f, 14f, 21f, 13.664f, 21f, 13.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(3.75f, 14f)
                curveTo(3.336f, 14f, 3f, 13.664f, 3f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(3f, 10.336f, 3.336f, 10f, 3.75f, 10f)
                curveTo(4.164f, 10f, 4.5f, 10.336f, 4.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(4.5f, 13.664f, 4.164f, 14f, 3.75f, 14f)
                close()
                moveTo(8.682f, 7.75f)
                curveTo(8.95f, 7.286f, 9.445f, 7f, 9.981f, 7f)
                horizontalLineTo(14.021f)
                curveTo(14.557f, 7f, 15.052f, 7.286f, 15.32f, 7.75f)
                lineTo(17.34f, 11.251f)
                curveTo(17.608f, 11.715f, 17.608f, 12.286f, 17.34f, 12.75f)
                lineTo(15.32f, 16.251f)
                curveTo(15.052f, 16.715f, 14.557f, 17.001f, 14.021f, 17.001f)
                horizontalLineTo(9.981f)
                curveTo(9.445f, 17.001f, 8.95f, 16.715f, 8.682f, 16.251f)
                lineTo(6.662f, 12.75f)
                curveTo(6.394f, 12.286f, 6.394f, 11.715f, 6.662f, 11.251f)
                lineTo(8.682f, 7.75f)
                close()
            }
        }.build()

        return _SquareHintHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _SquareHintHexagon: ImageVector? = null

@Preview
@Composable
private fun SquareHintHexagonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareHintHexagon, contentDescription = null)
    }
}
