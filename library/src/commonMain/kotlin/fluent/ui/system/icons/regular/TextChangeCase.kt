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
 * TextChangeCase Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general type creation and editing scenarios. Collection includes Text Case Lowercase, Text Case Title, Text Case Uppercase, Text Change Case.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_text_change_case_24_regular.svg)
 * 
 * @return The [ImageVector] for the TextChangeCase icon.
 */
public val FluentIcons.Regular.TextChangeCase: ImageVector
    get() {
        if (_textChangeCase != null) {
            return _textChangeCase!!
        }
        _textChangeCase = Builder(name = "TextChangeCase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.511f, 3.0f)
                curveTo(16.824f, 3.005f, 17.102f, 3.204f, 17.207f, 3.499f)
                lineTo(22.707f, 18.999f)
                curveTo(22.845f, 19.39f, 22.641f, 19.818f, 22.251f, 19.957f)
                curveTo(21.86f, 20.095f, 21.432f, 19.891f, 21.293f, 19.501f)
                lineTo(19.874f, 15.5f)
                lineTo(12.756f, 15.5f)
                lineTo(11.199f, 19.521f)
                curveTo(11.05f, 19.907f, 10.616f, 20.099f, 10.229f, 19.949f)
                curveTo(9.843f, 19.8f, 9.651f, 19.365f, 9.801f, 18.979f)
                lineTo(15.8f, 3.479f)
                curveTo(15.914f, 3.187f, 16.197f, 2.996f, 16.511f, 3.0f)
                close()
                moveTo(16.469f, 5.907f)
                lineTo(13.336f, 14.0f)
                lineTo(19.341f, 14.0f)
                lineTo(16.469f, 5.907f)
                close()
                moveTo(5.5f, 10.501f)
                lineTo(5.787f, 10.511f)
                curveTo(7.748f, 10.609f, 8.915f, 11.737f, 8.995f, 13.556f)
                lineTo(9.0f, 13.76f)
                verticalLineTo(19.26f)
                curveTo(9.0f, 19.64f, 8.718f, 19.954f, 8.352f, 20.003f)
                lineTo(8.25f, 20.01f)
                curveTo(7.87f, 20.01f, 7.557f, 19.728f, 7.507f, 19.362f)
                lineTo(7.5f, 19.26f)
                lineTo(7.499f, 19.156f)
                curveTo(6.511f, 19.721f, 5.598f, 20.01f, 4.75f, 20.01f)
                curveTo(2.912f, 20.01f, 1.5f, 18.716f, 1.5f, 16.76f)
                curveTo(1.5f, 15.036f, 2.688f, 13.755f, 4.66f, 13.516f)
                curveTo(5.592f, 13.403f, 6.54f, 13.474f, 7.499f, 13.726f)
                curveTo(7.489f, 12.618f, 6.943f, 12.071f, 5.713f, 12.009f)
                curveTo(4.751f, 11.962f, 4.074f, 12.097f, 3.678f, 12.374f)
                curveTo(3.339f, 12.612f, 2.871f, 12.53f, 2.634f, 12.191f)
                curveTo(2.396f, 11.852f, 2.478f, 11.384f, 2.817f, 11.146f)
                curveTo(3.475f, 10.685f, 4.371f, 10.481f, 5.5f, 10.501f)
                close()
                moveTo(7.499f, 15.324f)
                lineTo(7.196f, 15.234f)
                curveTo(6.389f, 15.012f, 5.605f, 14.949f, 4.84f, 15.041f)
                curveTo(3.608f, 15.191f, 3.0f, 15.846f, 3.0f, 16.797f)
                curveTo(3.0f, 17.893f, 3.712f, 18.547f, 4.75f, 18.547f)
                curveTo(5.43f, 18.547f, 6.268f, 18.232f, 7.251f, 17.583f)
                lineTo(7.499f, 17.414f)
                verticalLineTo(15.324f)
                close()
            }
        }
        .build()
        return _textChangeCase!!
    }

@Suppress("ObjectPropertyName")
private var _textChangeCase: ImageVector? = null

@Preview
@Composable
private fun TextChangeCasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TextChangeCase, contentDescription = "TextChangeCase Icon")
    }
}

