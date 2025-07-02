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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * MentionArrowDown icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: mention, arrow, down
 * - Source: ic_fluent_mention_arrow_down_20_regular.svg
 * 
 * @return The [ImageVector] for the MentionArrowDown icon.
 */
public val FluentIcons.Regular.MentionArrowDown: ImageVector
    get() {
        if (_mentionArrowDown != null) {
            return _mentionArrowDown!!
        }
        _mentionArrowDown = Builder(name = "MentionArrowDown", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 5.5f)
                curveTo(10.0f, 7.985f, 7.985f, 10.0f, 5.5f, 10.0f)
                curveTo(3.015f, 10.0f, 1.0f, 7.985f, 1.0f, 5.5f)
                curveTo(1.0f, 3.015f, 3.015f, 1.0f, 5.5f, 1.0f)
                curveTo(7.985f, 1.0f, 10.0f, 3.015f, 10.0f, 5.5f)
                close()
                moveTo(5.146f, 7.853f)
                lineTo(5.149f, 7.856f)
                curveTo(5.196f, 7.903f, 5.251f, 7.938f, 5.309f, 7.962f)
                curveTo(5.367f, 7.986f, 5.43f, 8.0f, 5.497f, 8.0f)
                lineTo(5.5f, 8.0f)
                lineTo(5.503f, 8.0f)
                curveTo(5.57f, 8.0f, 5.633f, 7.986f, 5.691f, 7.962f)
                curveTo(5.75f, 7.938f, 5.806f, 7.901f, 5.854f, 7.854f)
                lineTo(7.854f, 5.854f)
                curveTo(8.049f, 5.658f, 8.049f, 5.342f, 7.854f, 5.146f)
                curveTo(7.658f, 4.951f, 7.342f, 4.951f, 7.146f, 5.146f)
                lineTo(6.0f, 6.293f)
                verticalLineTo(3.5f)
                curveTo(6.0f, 3.224f, 5.776f, 3.0f, 5.5f, 3.0f)
                curveTo(5.224f, 3.0f, 5.0f, 3.224f, 5.0f, 3.5f)
                lineTo(5.0f, 6.293f)
                lineTo(3.854f, 5.146f)
                curveTo(3.658f, 4.951f, 3.342f, 4.951f, 3.146f, 5.146f)
                curveTo(2.951f, 5.342f, 2.951f, 5.658f, 3.146f, 5.854f)
                lineTo(5.146f, 7.853f)
                close()
                moveTo(13.0f, 8.044f)
                curveTo(12.457f, 7.446f, 11.709f, 7.074f, 10.79f, 7.01f)
                curveTo(10.692f, 7.356f, 10.56f, 7.687f, 10.399f, 8.002f)
                curveTo(10.433f, 8.001f, 10.466f, 8.0f, 10.5f, 8.0f)
                curveTo(12.076f, 8.0f, 13.0f, 9.171f, 13.0f, 11.0f)
                curveTo(13.0f, 12.797f, 12.034f, 14.0f, 10.5f, 14.0f)
                curveTo(8.966f, 14.0f, 8.0f, 12.797f, 8.0f, 11.0f)
                curveTo(8.0f, 10.784f, 8.013f, 10.577f, 8.038f, 10.381f)
                curveTo(7.711f, 10.551f, 7.365f, 10.689f, 7.004f, 10.792f)
                curveTo(7.001f, 10.861f, 7.0f, 10.93f, 7.0f, 11.0f)
                curveTo(7.0f, 13.307f, 8.359f, 15.0f, 10.5f, 15.0f)
                curveTo(11.782f, 15.0f, 12.784f, 14.393f, 13.38f, 13.41f)
                curveTo(13.859f, 14.719f, 14.774f, 15.5f, 16.0f, 15.5f)
                curveTo(17.858f, 15.5f, 19.0f, 13.706f, 19.0f, 11.0f)
                curveTo(19.0f, 6.582f, 15.418f, 3.0f, 11.0f, 3.0f)
                curveTo(10.802f, 3.0f, 10.606f, 3.007f, 10.411f, 3.021f)
                curveTo(10.569f, 3.333f, 10.697f, 3.661f, 10.794f, 4.003f)
                curveTo(10.862f, 4.001f, 10.931f, 4.0f, 11.0f, 4.0f)
                curveTo(14.866f, 4.0f, 18.0f, 7.134f, 18.0f, 11.0f)
                curveTo(18.0f, 13.222f, 17.187f, 14.5f, 16.0f, 14.5f)
                curveTo(14.813f, 14.5f, 14.0f, 13.222f, 14.0f, 11.0f)
                verticalLineTo(7.5f)
                lineTo(13.992f, 7.41f)
                curveTo(13.95f, 7.177f, 13.745f, 7.0f, 13.5f, 7.0f)
                curveTo(13.224f, 7.0f, 13.0f, 7.224f, 13.0f, 7.5f)
                lineTo(13.0f, 8.044f)
                close()
                moveTo(3.021f, 10.411f)
                curveTo(3.333f, 10.569f, 3.661f, 10.697f, 4.003f, 10.794f)
                curveTo(4.001f, 10.862f, 4.0f, 10.931f, 4.0f, 11.0f)
                curveTo(4.0f, 14.866f, 7.134f, 18.0f, 11.0f, 18.0f)
                curveTo(11.823f, 18.0f, 12.626f, 17.858f, 13.383f, 17.584f)
                curveTo(13.643f, 17.49f, 13.93f, 17.624f, 14.024f, 17.884f)
                curveTo(14.118f, 18.144f, 13.983f, 18.43f, 13.724f, 18.524f)
                curveTo(12.858f, 18.838f, 11.94f, 19.0f, 11.0f, 19.0f)
                curveTo(6.582f, 19.0f, 3.0f, 15.418f, 3.0f, 11.0f)
                curveTo(3.0f, 10.802f, 3.007f, 10.606f, 3.021f, 10.411f)
                close()
            }
        }
        .build()
        return _mentionArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _mentionArrowDown: ImageVector? = null

@Preview
@Composable
private fun MentionArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MentionArrowDown, contentDescription = null)
    }
}

