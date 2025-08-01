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

public val FluentIcons.Color.QuestionCircle: ImageVector
    get() {
        if (_QuestionCircle != null) {
            return _QuestionCircle!!
        }
        _QuestionCircle = ImageVector.Builder(
            name = "Colored.QuestionCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(2f, 2f),
                    end = Offset(22f, 22f)
                )
            ) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.478f, 22f, 12f)
                curveTo(22f, 17.522f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.522f, 2f, 12f)
                curveTo(2f, 6.478f, 6.477f, 2f, 12f, 2f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFCCEAFF)
                    ),
                    start = Offset(9.731f, 6.939f),
                    end = Offset(13.007f, 17.744f)
                )
            ) {
                moveTo(12f, 15.5f)
                curveTo(11.448f, 15.5f, 11f, 15.948f, 11f, 16.5f)
                curveTo(11f, 17.052f, 11.448f, 17.5f, 12f, 17.5f)
                curveTo(12.552f, 17.5f, 13f, 17.052f, 13f, 16.5f)
                curveTo(13f, 15.948f, 12.552f, 15.5f, 12f, 15.5f)
                close()
                moveTo(12f, 6.75f)
                curveTo(10.481f, 6.75f, 9.25f, 7.981f, 9.25f, 9.5f)
                curveTo(9.25f, 9.914f, 9.586f, 10.25f, 10f, 10.25f)
                curveTo(10.38f, 10.25f, 10.693f, 9.968f, 10.743f, 9.602f)
                lineTo(10.75f, 9.5f)
                curveTo(10.75f, 8.81f, 11.31f, 8.25f, 12f, 8.25f)
                curveTo(12.69f, 8.25f, 13.25f, 8.81f, 13.25f, 9.5f)
                curveTo(13.25f, 10.039f, 13.115f, 10.305f, 12.605f, 10.832f)
                lineTo(12.47f, 10.97f)
                curveTo(11.592f, 11.848f, 11.25f, 12.417f, 11.25f, 13.5f)
                curveTo(11.25f, 13.914f, 11.586f, 14.25f, 12f, 14.25f)
                curveTo(12.414f, 14.25f, 12.75f, 13.914f, 12.75f, 13.5f)
                curveTo(12.75f, 12.961f, 12.885f, 12.695f, 13.395f, 12.168f)
                lineTo(13.53f, 12.03f)
                curveTo(14.408f, 11.152f, 14.75f, 10.583f, 14.75f, 9.5f)
                curveTo(14.75f, 7.981f, 13.519f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()

        return _QuestionCircle!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionCircle: ImageVector? = null

@Preview
@Composable
private fun QuestionCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.QuestionCircle, contentDescription = null)
    }
}
