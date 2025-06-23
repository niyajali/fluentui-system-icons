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

public val FluentIcons.Filled.ImageArrowForward: ImageVector
    get() {
        if (_ImageArrowForward != null) {
            return _ImageArrowForward!!
        }
        _ImageArrowForward = ImageVector.Builder(
            name = "Filled.ImageArrowForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(12f, 9.538f, 9.538f, 12f, 6.5f, 12f)
                curveTo(3.462f, 12f, 1f, 9.538f, 1f, 6.5f)
                curveTo(1f, 3.462f, 3.462f, 1f, 6.5f, 1f)
                curveTo(9.538f, 1f, 12f, 3.462f, 12f, 6.5f)
                close()
                moveTo(5.354f, 4.354f)
                curveTo(5.549f, 4.158f, 5.549f, 3.842f, 5.354f, 3.646f)
                curveTo(5.158f, 3.451f, 4.842f, 3.451f, 4.646f, 3.646f)
                lineTo(3.146f, 5.146f)
                curveTo(2.951f, 5.342f, 2.951f, 5.658f, 3.146f, 5.854f)
                lineTo(4.646f, 7.354f)
                curveTo(4.842f, 7.549f, 5.158f, 7.549f, 5.354f, 7.354f)
                curveTo(5.549f, 7.158f, 5.549f, 6.842f, 5.354f, 6.646f)
                lineTo(4.707f, 6f)
                horizontalLineTo(6.75f)
                curveTo(7.993f, 6f, 9f, 7.007f, 9f, 8.25f)
                verticalLineTo(8.5f)
                curveTo(9f, 8.776f, 9.224f, 9f, 9.5f, 9f)
                curveTo(9.776f, 9f, 10f, 8.776f, 10f, 8.5f)
                verticalLineTo(8.25f)
                curveTo(10f, 6.455f, 8.545f, 5f, 6.75f, 5f)
                horizontalLineTo(4.707f)
                lineTo(5.354f, 4.354f)
                close()
                moveTo(15.752f, 7.5f)
                curveTo(16.167f, 7.5f, 16.504f, 7.837f, 16.504f, 8.252f)
                curveTo(16.504f, 8.667f, 16.167f, 9.004f, 15.752f, 9.004f)
                curveTo(15.337f, 9.004f, 15f, 8.667f, 15f, 8.252f)
                curveTo(15f, 7.837f, 15.337f, 7.5f, 15.752f, 7.5f)
                close()
                moveTo(13f, 6.5f)
                curveTo(13f, 10.09f, 10.09f, 13f, 6.5f, 13f)
                curveTo(5.211f, 13f, 4.01f, 12.625f, 3f, 11.978f)
                verticalLineTo(17.75f)
                curveTo(3f, 18.377f, 3.178f, 18.963f, 3.485f, 19.459f)
                lineTo(10.424f, 12.648f)
                lineTo(10.559f, 12.525f)
                curveTo(11.394f, 11.827f, 12.615f, 11.829f, 13.448f, 12.531f)
                lineTo(13.576f, 12.648f)
                lineTo(20.515f, 19.459f)
                curveTo(20.822f, 18.963f, 21f, 18.377f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(11.978f)
                curveTo(12.625f, 4.01f, 13f, 5.211f, 13f, 6.5f)
                close()
                moveTo(15.752f, 6f)
                curveTo(16.996f, 6f, 18.004f, 7.008f, 18.004f, 8.252f)
                curveTo(18.004f, 9.496f, 16.996f, 10.504f, 15.752f, 10.504f)
                curveTo(14.508f, 10.504f, 13.5f, 9.496f, 13.5f, 8.252f)
                curveTo(13.5f, 7.008f, 14.508f, 6f, 15.752f, 6f)
                close()
                moveTo(11.475f, 13.718f)
                lineTo(11.558f, 13.647f)
                curveTo(11.817f, 13.458f, 12.17f, 13.455f, 12.432f, 13.64f)
                lineTo(12.525f, 13.718f)
                lineTo(19.453f, 20.519f)
                curveTo(18.958f, 20.824f, 18.375f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(5.626f, 21f, 5.042f, 20.824f, 4.547f, 20.519f)
                lineTo(11.475f, 13.718f)
                close()
            }
        }.build()

        return _ImageArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _ImageArrowForward: ImageVector? = null

@Preview
@Composable
private fun ImageArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageArrowForward, contentDescription = null)
    }
}
