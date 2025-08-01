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

public val FluentIcons.Regular.Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Regular.Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.78f, 5.78f)
                curveTo(22.073f, 5.487f, 22.073f, 5.013f, 21.78f, 4.72f)
                curveTo(21.487f, 4.427f, 21.013f, 4.427f, 20.72f, 4.72f)
                lineTo(13.22f, 12.22f)
                curveTo(12.927f, 12.513f, 12.927f, 12.987f, 13.22f, 13.28f)
                curveTo(13.513f, 13.573f, 13.987f, 13.573f, 14.28f, 13.28f)
                lineTo(21.78f, 5.78f)
                close()
                moveTo(21.947f, 7.028f)
                curveTo(21.982f, 7.197f, 22f, 7.371f, 22f, 7.55f)
                verticalLineTo(14.45f)
                curveTo(22f, 15.858f, 20.858f, 17f, 19.45f, 17f)
                lineTo(4.55f, 17f)
                curveTo(3.142f, 17f, 2f, 15.858f, 2f, 14.45f)
                verticalLineTo(7.55f)
                curveTo(2f, 6.142f, 3.142f, 5f, 4.55f, 5f)
                lineTo(19.025f, 5f)
                lineTo(17.525f, 6.5f)
                lineTo(4.55f, 6.5f)
                curveTo(3.97f, 6.5f, 3.5f, 6.97f, 3.5f, 7.55f)
                verticalLineTo(14.45f)
                curveTo(3.5f, 15.03f, 3.97f, 15.5f, 4.55f, 15.5f)
                lineTo(19.45f, 15.5f)
                curveTo(20.03f, 15.5f, 20.5f, 15.03f, 20.5f, 14.45f)
                verticalLineTo(8.475f)
                lineTo(21.947f, 7.028f)
                close()
                moveTo(4.5f, 9.25f)
                curveTo(4.5f, 8.836f, 4.836f, 8.5f, 5.25f, 8.5f)
                horizontalLineTo(7.25f)
                curveTo(7.664f, 8.5f, 8f, 8.836f, 8f, 9.25f)
                curveTo(8f, 9.664f, 7.664f, 10f, 7.25f, 10f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 10f, 4.5f, 9.664f, 4.5f, 9.25f)
                close()
                moveTo(4.5f, 12.75f)
                curveTo(4.5f, 12.336f, 4.836f, 12f, 5.25f, 12f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 12f, 11f, 12.336f, 11f, 12.75f)
                curveTo(11f, 13.164f, 10.664f, 13.5f, 10.25f, 13.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 13.5f, 4.5f, 13.164f, 4.5f, 12.75f)
                close()
            }
        }.build()

        return _Check!!
    }

@Suppress("ObjectPropertyName")
private var _Check: ImageVector? = null

@Preview
@Composable
private fun CheckPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Check, contentDescription = null)
    }
}
