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
 * MailInboxPerson icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: mail, inbox, person
 * - Source: ic_fluent_mail_inbox_person_20_regular.svg
 * 
 * @return The [ImageVector] for the MailInboxPerson icon.
 */
public val FluentIcons.Regular.MailInboxPerson: ImageVector
    get() {
        if (_mailInboxPerson != null) {
            return _mailInboxPerson!!
        }
        _mailInboxPerson = Builder(name = "MailInboxPerson", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(11.038f)
                curveTo(11.013f, 16.834f, 11.0f, 16.667f, 11.0f, 16.5f)
                curveTo(11.0f, 16.329f, 11.017f, 16.162f, 11.05f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.05f)
                curveTo(7.097f, 11.264f, 7.187f, 11.616f, 7.365f, 11.974f)
                curveTo(7.551f, 12.345f, 7.838f, 12.732f, 8.277f, 13.025f)
                curveTo(8.72f, 13.32f, 9.288f, 13.5f, 10.0f, 13.5f)
                curveTo(10.712f, 13.5f, 11.28f, 13.32f, 11.723f, 13.025f)
                curveTo(12.072f, 12.793f, 12.325f, 12.501f, 12.507f, 12.204f)
                curveTo(12.502f, 12.137f, 12.5f, 12.068f, 12.5f, 12.0f)
                curveTo(12.5f, 11.232f, 12.789f, 10.531f, 13.264f, 10.0f)
                horizontalLineTo(12.5f)
                curveTo(12.224f, 10.0f, 12.0f, 10.223f, 12.0f, 10.499f)
                lineTo(12.0f, 10.511f)
                curveTo(11.999f, 10.524f, 11.998f, 10.544f, 11.996f, 10.572f)
                curveTo(11.993f, 10.627f, 11.984f, 10.709f, 11.968f, 10.808f)
                curveTo(11.934f, 11.01f, 11.868f, 11.271f, 11.74f, 11.526f)
                curveTo(11.614f, 11.78f, 11.432f, 12.018f, 11.168f, 12.193f)
                curveTo(10.907f, 12.367f, 10.538f, 12.5f, 10.0f, 12.5f)
                curveTo(9.462f, 12.5f, 9.093f, 12.367f, 8.832f, 12.193f)
                curveTo(8.568f, 12.018f, 8.386f, 11.78f, 8.26f, 11.526f)
                curveTo(8.132f, 11.271f, 8.066f, 11.01f, 8.032f, 10.808f)
                curveTo(8.016f, 10.709f, 8.008f, 10.627f, 8.004f, 10.572f)
                curveTo(8.002f, 10.544f, 8.001f, 10.524f, 8.0f, 10.511f)
                lineTo(8.0f, 10.499f)
                curveTo(8.0f, 10.224f, 7.776f, 10.0f, 7.5f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                curveTo(4.0f, 4.895f, 4.895f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 4.0f, 16.0f, 4.895f, 16.0f, 6.0f)
                verticalLineTo(9.041f)
                curveTo(16.359f, 9.102f, 16.696f, 9.226f, 17.0f, 9.401f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 13.105f, 16.605f, 14.0f, 15.5f, 14.0f)
                curveTo(14.395f, 14.0f, 13.5f, 13.105f, 13.5f, 12.0f)
                curveTo(13.5f, 10.895f, 14.395f, 10.0f, 15.5f, 10.0f)
                curveTo(16.605f, 10.0f, 17.5f, 10.895f, 17.5f, 12.0f)
                close()
                moveTo(19.0f, 16.5f)
                curveTo(19.0f, 17.745f, 18.0f, 19.0f, 15.5f, 19.0f)
                curveTo(13.0f, 19.0f, 12.0f, 17.75f, 12.0f, 16.5f)
                curveTo(12.0f, 15.672f, 12.672f, 15.0f, 13.5f, 15.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 15.0f, 19.0f, 15.672f, 19.0f, 16.5f)
                close()
            }
        }
        .build()
        return _mailInboxPerson!!
    }

@Suppress("ObjectPropertyName")
private var _mailInboxPerson: ImageVector? = null

@Preview
@Composable
private fun MailInboxPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailInboxPerson, contentDescription = null)
    }
}

