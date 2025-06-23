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

public val FluentIcons.Regular.EmojiHint: ImageVector
    get() {
        if (_EmojiHint != null) {
            return _EmojiHint!!
        }
        _EmojiHint = ImageVector.Builder(
            name = "Regular.EmojiHint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.049f, 2.19f)
                curveTo(9.643f, 2.271f, 9.379f, 2.665f, 9.459f, 3.072f)
                curveTo(9.539f, 3.478f, 9.934f, 3.742f, 10.34f, 3.662f)
                curveTo(11.413f, 3.45f, 12.587f, 3.45f, 13.66f, 3.662f)
                curveTo(14.066f, 3.742f, 14.461f, 3.478f, 14.541f, 3.072f)
                curveTo(14.621f, 2.665f, 14.357f, 2.271f, 13.951f, 2.19f)
                curveTo(12.688f, 1.94f, 11.312f, 1.94f, 10.049f, 2.19f)
                close()
                moveTo(7.278f, 4.931f)
                curveTo(7.622f, 4.701f, 7.714f, 4.235f, 7.484f, 3.891f)
                curveTo(7.253f, 3.547f, 6.788f, 3.454f, 6.443f, 3.685f)
                curveTo(5.353f, 4.415f, 4.415f, 5.353f, 3.685f, 6.443f)
                curveTo(3.454f, 6.788f, 3.547f, 7.253f, 3.891f, 7.484f)
                curveTo(4.235f, 7.714f, 4.701f, 7.622f, 4.931f, 7.278f)
                curveTo(5.552f, 6.351f, 6.351f, 5.552f, 7.278f, 4.931f)
                close()
                moveTo(17.557f, 3.685f)
                curveTo(17.212f, 3.454f, 16.747f, 3.547f, 16.516f, 3.891f)
                curveTo(16.286f, 4.235f, 16.378f, 4.701f, 16.722f, 4.931f)
                curveTo(17.649f, 5.552f, 18.448f, 6.351f, 19.069f, 7.278f)
                curveTo(19.299f, 7.622f, 19.765f, 7.714f, 20.109f, 7.484f)
                curveTo(20.453f, 7.253f, 20.546f, 6.788f, 20.315f, 6.443f)
                curveTo(19.585f, 5.353f, 18.647f, 4.415f, 17.557f, 3.685f)
                close()
                moveTo(21.81f, 10.049f)
                curveTo(21.729f, 9.643f, 21.335f, 9.379f, 20.928f, 9.459f)
                curveTo(20.522f, 9.539f, 20.258f, 9.934f, 20.338f, 10.34f)
                curveTo(20.55f, 11.413f, 20.55f, 12.587f, 20.338f, 13.66f)
                curveTo(20.258f, 14.066f, 20.522f, 14.461f, 20.928f, 14.541f)
                curveTo(21.335f, 14.621f, 21.729f, 14.357f, 21.81f, 13.951f)
                curveTo(22.06f, 12.688f, 22.06f, 11.312f, 21.81f, 10.049f)
                close()
                moveTo(3.662f, 10.34f)
                curveTo(3.742f, 9.934f, 3.478f, 9.539f, 3.072f, 9.459f)
                curveTo(2.665f, 9.379f, 2.271f, 9.643f, 2.19f, 10.049f)
                curveTo(1.94f, 11.312f, 1.94f, 12.688f, 2.19f, 13.951f)
                curveTo(2.271f, 14.357f, 2.665f, 14.621f, 3.072f, 14.541f)
                curveTo(3.478f, 14.461f, 3.742f, 14.066f, 3.662f, 13.66f)
                curveTo(3.45f, 12.587f, 3.45f, 11.413f, 3.662f, 10.34f)
                close()
                moveTo(4.931f, 16.722f)
                curveTo(4.701f, 16.378f, 4.235f, 16.286f, 3.891f, 16.516f)
                curveTo(3.547f, 16.747f, 3.454f, 17.212f, 3.685f, 17.557f)
                curveTo(4.415f, 18.647f, 5.353f, 19.585f, 6.443f, 20.315f)
                curveTo(6.788f, 20.546f, 7.253f, 20.453f, 7.484f, 20.109f)
                curveTo(7.714f, 19.765f, 7.622f, 19.299f, 7.278f, 19.069f)
                curveTo(6.351f, 18.448f, 5.552f, 17.649f, 4.931f, 16.722f)
                close()
                moveTo(20.315f, 17.557f)
                curveTo(20.546f, 17.212f, 20.453f, 16.747f, 20.109f, 16.516f)
                curveTo(19.765f, 16.286f, 19.299f, 16.378f, 19.069f, 16.722f)
                curveTo(18.448f, 17.649f, 17.649f, 18.448f, 16.722f, 19.069f)
                curveTo(16.378f, 19.299f, 16.286f, 19.765f, 16.516f, 20.109f)
                curveTo(16.747f, 20.453f, 17.212f, 20.546f, 17.557f, 20.315f)
                curveTo(18.647f, 19.585f, 19.585f, 18.647f, 20.315f, 17.557f)
                close()
                moveTo(10.34f, 20.338f)
                curveTo(9.934f, 20.258f, 9.539f, 20.522f, 9.459f, 20.928f)
                curveTo(9.379f, 21.335f, 9.643f, 21.729f, 10.049f, 21.81f)
                curveTo(11.312f, 22.06f, 12.688f, 22.06f, 13.951f, 21.81f)
                curveTo(14.357f, 21.729f, 14.621f, 21.335f, 14.541f, 20.928f)
                curveTo(14.461f, 20.522f, 14.066f, 20.258f, 13.66f, 20.338f)
                curveTo(12.587f, 20.55f, 11.413f, 20.55f, 10.34f, 20.338f)
                close()
                moveTo(9.5f, 11f)
                curveTo(10.052f, 11f, 10.5f, 10.552f, 10.5f, 10f)
                curveTo(10.5f, 9.448f, 10.052f, 9f, 9.5f, 9f)
                curveTo(8.948f, 9f, 8.5f, 9.448f, 8.5f, 10f)
                curveTo(8.5f, 10.552f, 8.948f, 11f, 9.5f, 11f)
                close()
                moveTo(15.5f, 10f)
                curveTo(15.5f, 10.552f, 15.052f, 11f, 14.5f, 11f)
                curveTo(13.948f, 11f, 13.5f, 10.552f, 13.5f, 10f)
                curveTo(13.5f, 9.448f, 13.948f, 9f, 14.5f, 9f)
                curveTo(15.052f, 9f, 15.5f, 9.448f, 15.5f, 10f)
                close()
                moveTo(9.323f, 14.255f)
                curveTo(9.056f, 13.939f, 8.583f, 13.899f, 8.266f, 14.166f)
                curveTo(7.95f, 14.433f, 7.91f, 14.906f, 8.177f, 15.223f)
                curveTo(9.093f, 16.308f, 10.466f, 17f, 12f, 17f)
                curveTo(13.534f, 17f, 14.907f, 16.308f, 15.823f, 15.223f)
                curveTo(16.09f, 14.906f, 16.05f, 14.433f, 15.733f, 14.166f)
                curveTo(15.417f, 13.899f, 14.943f, 13.939f, 14.676f, 14.255f)
                curveTo(14.033f, 15.018f, 13.073f, 15.5f, 12f, 15.5f)
                curveTo(10.926f, 15.5f, 9.966f, 15.018f, 9.323f, 14.255f)
                close()
            }
        }.build()

        return _EmojiHint!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiHint: ImageVector? = null

@Preview
@Composable
private fun EmojiHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EmojiHint, contentDescription = null)
    }
}
