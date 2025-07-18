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

public val FluentIcons.Regular.PhoneSpeaker: ImageVector
    get() {
        if (_PhoneSpeaker != null) {
            return _PhoneSpeaker!!
        }
        _PhoneSpeaker = ImageVector.Builder(
            name = "Regular.PhoneSpeaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
                verticalLineTo(12.923f)
                curveTo(15.632f, 12.974f, 15.271f, 13.147f, 14.973f, 13.464f)
                lineTo(14.5f, 13.969f)
                verticalLineTo(4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(13.75f)
                curveTo(13.827f, 20.5f, 13.901f, 20.488f, 13.971f, 20.467f)
                lineTo(14.973f, 21.536f)
                curveTo(14.993f, 21.557f, 15.014f, 21.578f, 15.034f, 21.598f)
                curveTo(14.67f, 21.851f, 14.227f, 22f, 13.75f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(8.749f, 17.504f)
                lineTo(11f, 17.5f)
                verticalLineTo(19f)
                lineTo(8.751f, 19.004f)
                curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
                curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
                close()
                moveTo(22.143f, 14.302f)
                curveTo(21.815f, 13.755f, 21.478f, 13.381f, 21.23f, 13.174f)
                curveTo(20.912f, 12.909f, 20.439f, 12.952f, 20.174f, 13.27f)
                curveTo(19.909f, 13.588f, 19.952f, 14.061f, 20.27f, 14.326f)
                curveTo(20.397f, 14.432f, 20.623f, 14.683f, 20.857f, 15.073f)
                curveTo(21.258f, 15.742f, 21.5f, 16.548f, 21.5f, 17.5f)
                curveTo(21.5f, 18.452f, 21.258f, 19.258f, 20.857f, 19.927f)
                curveTo(20.623f, 20.317f, 20.397f, 20.568f, 20.27f, 20.674f)
                curveTo(19.952f, 20.939f, 19.909f, 21.412f, 20.174f, 21.73f)
                curveTo(20.439f, 22.048f, 20.912f, 22.091f, 21.23f, 21.826f)
                curveTo(21.478f, 21.619f, 21.815f, 21.245f, 22.143f, 20.698f)
                curveTo(22.679f, 19.805f, 23f, 18.736f, 23f, 17.5f)
                curveTo(23f, 16.264f, 22.679f, 15.195f, 22.143f, 14.302f)
                close()
                moveTo(19.874f, 15.396f)
                curveTo(19.635f, 15.038f, 19.389f, 14.791f, 19.2f, 14.65f)
                curveTo(18.869f, 14.401f, 18.399f, 14.469f, 18.15f, 14.8f)
                curveTo(17.902f, 15.131f, 17.969f, 15.601f, 18.3f, 15.85f)
                curveTo(18.362f, 15.896f, 18.49f, 16.025f, 18.626f, 16.229f)
                curveTo(18.86f, 16.58f, 19f, 17f, 19f, 17.5f)
                curveTo(19f, 18f, 18.86f, 18.42f, 18.626f, 18.771f)
                curveTo(18.49f, 18.975f, 18.362f, 19.104f, 18.3f, 19.15f)
                lineTo(18.216f, 19.223f)
                curveTo(17.959f, 19.483f, 17.924f, 19.899f, 18.15f, 20.2f)
                curveTo(18.399f, 20.531f, 18.869f, 20.598f, 19.2f, 20.35f)
                curveTo(19.389f, 20.209f, 19.635f, 19.962f, 19.874f, 19.604f)
                curveTo(20.265f, 19.017f, 20.5f, 18.312f, 20.5f, 17.5f)
                curveTo(20.5f, 16.688f, 20.265f, 15.983f, 19.874f, 15.396f)
                close()
                moveTo(17f, 14.75f)
                curveTo(17f, 14.438f, 16.806f, 14.158f, 16.514f, 14.048f)
                curveTo(16.221f, 13.938f, 15.891f, 14.021f, 15.686f, 14.256f)
                lineTo(14.16f, 16f)
                horizontalLineTo(12.75f)
                curveTo(12.336f, 16f, 12f, 16.336f, 12f, 16.75f)
                verticalLineTo(18.25f)
                curveTo(12f, 18.664f, 12.336f, 19f, 12.75f, 19f)
                horizontalLineTo(14.16f)
                lineTo(15.686f, 20.744f)
                curveTo(15.891f, 20.979f, 16.221f, 21.062f, 16.514f, 20.952f)
                curveTo(16.806f, 20.842f, 17f, 20.563f, 17f, 20.25f)
                verticalLineTo(14.75f)
                close()
            }
        }.build()

        return _PhoneSpeaker!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSpeaker: ImageVector? = null

@Preview
@Composable
private fun PhoneSpeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneSpeaker, contentDescription = null)
    }
}
