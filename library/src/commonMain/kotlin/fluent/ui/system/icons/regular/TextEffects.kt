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
 * TextEffects Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_effects_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextEffects icon.
 */
public val FluentIcons.Regular.TextEffects: ImageVector
    get() {
        if (_textEffects != null) {
            return _textEffects!!
        }
        _textEffects = Builder(name = "TextEffects", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.298f, 4.015f)
                curveTo(13.905f, 3.096f, 13.001f, 2.5f, 12.001f, 2.5f)
                curveTo(11.0f, 2.5f, 10.097f, 3.096f, 9.703f, 4.015f)
                lineTo(5.439f, 13.965f)
                curveTo(5.423f, 13.999f, 5.408f, 14.033f, 5.394f, 14.068f)
                lineTo(3.703f, 18.015f)
                curveTo(3.159f, 19.284f, 3.747f, 20.754f, 5.016f, 21.298f)
                curveTo(6.285f, 21.842f, 7.755f, 21.254f, 8.299f, 19.985f)
                lineTo(9.363f, 17.5f)
                horizontalLineTo(14.638f)
                lineTo(15.703f, 19.985f)
                curveTo(16.247f, 21.254f, 17.716f, 21.842f, 18.985f, 21.298f)
                curveTo(20.254f, 20.754f, 20.842f, 19.284f, 20.299f, 18.015f)
                lineTo(18.607f, 14.068f)
                curveTo(18.593f, 14.033f, 18.578f, 13.999f, 18.562f, 13.964f)
                lineTo(14.298f, 4.015f)
                close()
                moveTo(12.495f, 12.5f)
                lineTo(12.001f, 11.347f)
                lineTo(11.506f, 12.5f)
                horizontalLineTo(12.495f)
                close()
                moveTo(12.92f, 4.606f)
                lineTo(17.197f, 14.586f)
                curveTo(17.203f, 14.599f, 17.209f, 14.613f, 17.215f, 14.627f)
                lineTo(18.92f, 18.606f)
                curveTo(19.137f, 19.114f, 18.902f, 19.702f, 18.395f, 19.919f)
                curveTo(17.887f, 20.137f, 17.299f, 19.902f, 17.081f, 19.394f)
                lineTo(15.627f, 16.0f)
                horizontalLineTo(8.374f)
                lineTo(6.92f, 19.394f)
                curveTo(6.702f, 19.902f, 6.114f, 20.137f, 5.607f, 19.919f)
                curveTo(5.099f, 19.702f, 4.864f, 19.114f, 5.081f, 18.606f)
                lineTo(6.787f, 14.627f)
                curveTo(6.792f, 14.613f, 6.798f, 14.599f, 6.804f, 14.586f)
                lineTo(11.081f, 4.606f)
                curveTo(11.239f, 4.238f, 11.601f, 4.0f, 12.001f, 4.0f)
                curveTo(12.401f, 4.0f, 12.762f, 4.238f, 12.92f, 4.606f)
                close()
                moveTo(14.77f, 14.0f)
                horizontalLineTo(9.231f)
                lineTo(12.001f, 7.539f)
                lineTo(14.77f, 14.0f)
                close()
            }
        }
        .build()
        return _textEffects!!
    }

@Suppress("ObjectPropertyName")
private var _textEffects: ImageVector? = null

@Preview
@Composable
private fun TextEffectsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextEffects, contentDescription = "TextEffects Icon")
    }
}

