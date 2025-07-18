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
package fluent.ui.system.icons.color

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Color.CodeBlock: ImageVector
    get() {
        if (_CodeBlock != null) {
            return _CodeBlock!!
        }
        _CodeBlock = ImageVector.Builder(
            name = "Colored.CodeBlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.028f to Color(0xFFE67EEA),
                        0.438f to Color(0xFFAD64D7),
                        1f to Color(0xFF794DC5)
                    ),
                    start = Offset(7.389f, 3f),
                    end = Offset(17.26f, 21f)
                )
            ) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFF9DCFA)
                    ),
                    start = Offset(8.845f, 8.308f),
                    end = Offset(13.544f, 20.472f)
                )
            ) {
                moveTo(10.53f, 9.28f)
                lineTo(7.811f, 12f)
                lineTo(10.53f, 14.72f)
                curveTo(10.823f, 15.013f, 10.823f, 15.487f, 10.53f, 15.78f)
                curveTo(10.237f, 16.073f, 9.763f, 16.073f, 9.47f, 15.78f)
                lineTo(6.22f, 12.53f)
                curveTo(5.927f, 12.237f, 5.927f, 11.763f, 6.22f, 11.47f)
                lineTo(9.47f, 8.22f)
                curveTo(9.763f, 7.927f, 10.237f, 7.927f, 10.53f, 8.22f)
                curveTo(10.823f, 8.513f, 10.823f, 8.987f, 10.53f, 9.28f)
                close()
                moveTo(14.53f, 8.22f)
                lineTo(17.78f, 11.47f)
                curveTo(18.073f, 11.763f, 18.073f, 12.237f, 17.78f, 12.53f)
                lineTo(14.53f, 15.78f)
                curveTo(14.237f, 16.073f, 13.763f, 16.073f, 13.47f, 15.78f)
                curveTo(13.177f, 15.487f, 13.177f, 15.013f, 13.47f, 14.72f)
                lineTo(16.189f, 12f)
                lineTo(13.47f, 9.28f)
                curveTo(13.177f, 8.987f, 13.177f, 8.513f, 13.47f, 8.22f)
                curveTo(13.763f, 7.927f, 14.237f, 7.927f, 14.53f, 8.22f)
                close()
            }
        }.build()

        return _CodeBlock!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBlock: ImageVector? = null

@Preview
@Composable
private fun CodeBlockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.CodeBlock, contentDescription = null)
    }
}
